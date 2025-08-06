package com.example.Own.VerdaMart.Controller;

import com.example.Own.VerdaMart.Service.CartService;
import com.example.Own.VerdaMart.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public String addToCart(@RequestParam Long productId, @RequestParam int quantity, Principal principal) {
        return cartService.addToCart(principal.getName(), productId, quantity);
    }

    @GetMapping
    public List<CartItem> getCartItems(Principal principal) {
        return cartService.getCartItems(principal.getName());
    }

    @DeleteMapping("/remove")
    public String removeFromCart(@RequestParam Long itemId, Principal principal) {
        return cartService.removeFromCart(principal.getName(), itemId);
    }

    @PostMapping("/checkout")
    public String checkout(Principal principal) {
        return cartService.checkout(principal.getName());
    }
}
