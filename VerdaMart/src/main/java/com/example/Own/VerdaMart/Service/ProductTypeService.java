package com.example.Own.VerdaMart.Service;


import com.example.Own.VerdaMart.Reposotory.productTyperepo;
import com.example.Own.VerdaMart.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductTypeService {
    @Autowired
    ProductService productService;

    @Autowired
    productTyperepo productTyperepo;


    public String addproductType(ProductType productType) {
        productTyperepo.save(productType);
        return productType.getName() + " added successfully";
    }
}
