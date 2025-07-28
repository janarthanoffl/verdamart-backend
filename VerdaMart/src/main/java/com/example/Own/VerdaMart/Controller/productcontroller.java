package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Service.ProductService;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productcontroller {

    @Autowired
    ProductService productService;



   @PostMapping("/UploadProduct")
    public  String UploadProduct(@RequestBody product product) {
       productService.uploadproducts(product);
       return "success";
   }

   @GetMapping("/AvailableItems")
    public List<product> AvailableItems() {
       return productService.availableitems();
   }

   
}
