package com.example.Own.VerdaMart.Dto;

import java.util.List;

public class CategoryDto {
    private Long id;
    private String name;
    private List<String> productTypes;

    public CategoryDto(Long id, String name, List<String> productTypes) {
        this.id = id;
        this.name = name;
        this.productTypes = productTypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<String> productTypes) {
        this.productTypes = productTypes;
    }
}
