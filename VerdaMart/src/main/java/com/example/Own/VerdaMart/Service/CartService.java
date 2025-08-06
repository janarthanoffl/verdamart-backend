package com.example.Own.VerdaMart.Service;

import com.example.Own.VerdaMart.Reposotory.CartRepository;
import com.example.Own.VerdaMart.Reposotory.ProductRepository;
import com.example.Own.VerdaMart.Reposotory.UserRepository;
import com.example.Own.VerdaMart.model.Cart;
import com.example.Own.VerdaMart.model.CartItem;
import com.example.Own.VerdaMart.model.User;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;

    public String addToCart(String username, Long productId, int quantity) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Cart cart = user.getCart();
        if (cart == null) {
            cart = new Cart();
            cart.setUser(user);
            user.setCart(cart);
        }

        CartItem item = new CartItem();
        item.setCart(cart);
        item.setProduct(product);
        item.setQuantity(quantity);

        cart.getCartItems().add(item);
        cartRepository.save(cart);

        return product.getName() + " added to cart!";
    }

    public List<CartItem> getCartItems(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Cart cart = user.getCart();
        return (cart != null) ? cart.getCartItems() : new ArrayList<>();
    }

    public String removeFromCart(String username, Long itemId) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Cart cart = user.getCart();
        if (cart == null) return "Cart is empty.";

        CartItem itemToRemove = cart.getCartItems().stream()
                .filter(i -> i.getId().equals(itemId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item not found in cart"));

        cart.getCartItems().remove(itemToRemove);
        cartRepository.save(cart);

        return "Item removed from cart.";
    }

    public String checkout(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Cart cart = user.getCart();
        if (cart == null || cart.getCartItems().isEmpty()) return "Cart is empty.";

        // Simulate checkout logic (e.g. payment, order generation, etc.)
        cart.getCartItems().clear();
        cartRepository.save(cart);

        return "Checkout successful. Thank you for your purchase!";
    }

}
