package com.example.Own.VerdaMart.Service;


import com.example.Own.VerdaMart.Reposotory.productTyperepo;
import com.example.Own.VerdaMart.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public List<ProductType> findall() {
        return productTyperepo.findAll();
    }

    public String deleteProductTypeByCategory(Long categoryId, Long productTypeId) {
        Optional<ProductType> optional = productTyperepo.findById(productTypeId);

        if (optional.isEmpty()) {
            return "ProductType with ID " + productTypeId + " not found.";
        }

        ProductType pt = optional.get();

        // Check if this ProductType belongs to the given Category ID
        if (pt.getCategory() == null || !pt.getCategory().getId().equals(categoryId)) {
            return "ProductType with ID " + productTypeId + " does not belong to Category ID " + categoryId;
        }

        productTyperepo.delete(pt);
        return "ProductType with ID " + productTypeId + " deleted from Category ID " + categoryId;
    }

}
