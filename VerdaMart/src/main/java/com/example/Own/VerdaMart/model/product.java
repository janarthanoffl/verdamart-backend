package com.example.Own.VerdaMart.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Eg: Fortune Groundnut Oil 1L
    private String brand;
    private BigDecimal price;
    private int quantity;
    private String description;
    private Float rating;
    private int AvailableQuantity; // Quantity available in stock
    private int sellingquantity; // Quantity available for selling
    private BigDecimal sellingprice;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    @JsonBackReference
    private ProductType productType;

    public product() {
    }

    public product(Long id, String name, String brand, BigDecimal price, int quantity, String description, Float rating, int availableQuantity, int sellingquantity, BigDecimal sellingprice, ProductType productType) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.rating = rating;
        AvailableQuantity = availableQuantity;
        this.sellingquantity = sellingquantity;
        this.sellingprice = sellingprice;
        this.productType = productType;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getAvailableQuantity() {
        return AvailableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        AvailableQuantity = availableQuantity;
    }

    public int getSellingquantity() {
        return sellingquantity;
    }

    public void setSellingquantity(int sellingquantity) {
        this.sellingquantity = sellingquantity;
    }

    public BigDecimal getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
