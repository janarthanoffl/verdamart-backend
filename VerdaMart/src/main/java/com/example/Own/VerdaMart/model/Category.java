package com.example.Own.VerdaMart.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Eg: Cooking Essentials, Vegetables & Fruits

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<ProductType> productTypes;

    public Category(Long id, String name, List<ProductType> productTypes) {
        this.id = id;
        this.name = name;
        this.productTypes = productTypes;
    }

    public Category() {
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

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }
}
