package com.example.Own.VerdaMart.Service;


import com.example.Own.VerdaMart.Reposotory.ProductRepository;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


  public void uploadproducts(product product) {
      productRepository.save(product);
//      return "Product uploaded successfully";
  }


    public List<product> availableitems() {
     return productRepository.findAll();
    }


    public String addQuantity(Long id, int available_quantity) {
        return productRepository.findById(id)
                .map(prod -> {
                    prod.setQuantity(prod.getAvailableQuantity() + available_quantity);
                    productRepository.save(prod);
                    return "Quantity updated successfully";
                })
                .orElse("Product not found");
    }
}
