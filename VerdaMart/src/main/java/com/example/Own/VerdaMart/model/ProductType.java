package com.example.Own.VerdaMart.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name; // Eg: Oils & Ghee, Rice & Grains

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "productType", cascade = CascadeType.ALL)
    private List<product> products;

    public ProductType(Long id, String name, Category category, List<product> products) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.products = products;
    }

    public ProductType() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
}
