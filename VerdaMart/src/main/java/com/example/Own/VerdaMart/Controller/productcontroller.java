package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Service.ProductService;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
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

   @PostMapping("/addquantity")
    public String addQuantity(@RequestParam Long id, @RequestParam int available_quantity) {
       return productService.addQuantity(id, available_quantity);
   }



   
}
