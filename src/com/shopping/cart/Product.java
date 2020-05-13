package com.shopping.cart;

public class Product {

    private double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
            "price=" + price +
            ", description='" + description + '\'' +
            '}';
    }
}
