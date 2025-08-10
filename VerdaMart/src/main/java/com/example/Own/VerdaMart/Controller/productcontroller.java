package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Service.ProductService;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

   @GetMapping("{name}")
   public Optional<product> GetProduct(@PathVariable String name) {
       return productService.getproduct(name);
   }

   @PostMapping("/addquantity")
    public String addQuantity(@RequestParam Long id, @RequestParam int available_quantity) {
       return productService.addQuantity(id, available_quantity);
   }



   
}
