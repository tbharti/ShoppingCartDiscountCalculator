package com.shopping;

import com.shopping.cart.Product;
import com.shopping.cart.ShoppingCart;
import com.shopping.discount.CustomerType;

public class ShoppingCartComputer {

    public static void main(String[] args) {

        Product product = new Product(30000, "smart phone");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product);
        shoppingCart.setCustomerType(CustomerType.PREMIUM);
        System.out.println("Cart value after discount : " + shoppingCart.checkout());

        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.addProduct(product);
        shoppingCart1.setCustomerType(CustomerType.REGULAR);
        System.out.println("Cart value after discount : " + shoppingCart.checkout());
    }

}
