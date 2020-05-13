package com.shopping.cart;

import com.shopping.discount.CustomerType;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;
    private CustomerType customerType;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public double checkout() {
        System.out.printf("\n\nGoing to calculate Shopping Cart bill for Customer Type: %s \n", customerType);
        return customerType.getDiscount().applyDiscount(
            productList.stream()
                .peek(product -> System.out
                    .println("Product name: " + product.getDescription() + ",  Price: " + product.getPrice()))
                .mapToDouble(Product::getPrice)
                .sum());
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

}
