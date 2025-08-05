package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Service.ProductTypeService;
import com.example.Own.VerdaMart.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catogory/productType")
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

    @PostMapping("/add")
    public String addProductType(@RequestBody ProductType productType) {
        return productTypeService.addproductType(productType);

    }
    @GetMapping("/findall")
    public List<ProductType> findAllProductType() {
        return productTypeService.findall();
    }
    @DeleteMapping("/delete/category/{categoryId}/product-type/{productTypeId}")
    public String deleteProductTypeByCategory(@PathVariable Long categoryId, @PathVariable Long productTypeId) {
        return productTypeService.deleteProductTypeByCategory(categoryId, productTypeId);
    }


}
