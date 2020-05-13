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
        System.out.printf("Product %s added to cart \n", product.getDescription());
        this.productList.add(product);
    }

    public double checkout() {
        return customerType.getDiscount().applyDiscount(productList.stream()
            .mapToDouble(Product::getPrice)
            .sum());
    }

    public void setCustomerType(CustomerType customerType) {
        System.out.printf("Customer Type set to %s \n", customerType);
        this.customerType = customerType;
    }

}
