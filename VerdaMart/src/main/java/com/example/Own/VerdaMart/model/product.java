package com.example.Own.VerdaMart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {

    @Id
    String name;
    int price;
    String Stock;
    String remainStock;
    String supplier;

    public product(int price, String name, String stock, String remainStock, String supplier) {
        this.price = price;
        this.name = name;
        this.Stock = stock;
        this.remainStock = remainStock;
        this.supplier = supplier;
    }

    public product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        this.Stock = stock;
    }

    public String getRemainStock() {
        return remainStock;
    }

    public void setRemainStock(String remainStock) {
        this.remainStock = remainStock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
