package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Service.ProductTypeService;
import com.example.Own.VerdaMart.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catogory")
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

    @PostMapping("/add")
    public String addProductType(ProductType productType) {
        return productTypeService.addproductType(productType);

    }
}
