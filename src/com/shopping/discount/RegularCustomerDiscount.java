package com.shopping.discount;

public class RegularCustomerDiscount implements Discount {

    @Override
    public double applyDiscount(double cartTotalAmount) {

        System.out.println("Total Cart Value before Discount " + cartTotalAmount);

        double discountPercentage = 0;

        if (cartTotalAmount >= 0 && cartTotalAmount < 5000) {
            discountPercentage = 0;
        } else if (cartTotalAmount >= 5000 && cartTotalAmount < 10000) {
            discountPercentage = 10;
        } else if (cartTotalAmount >= 10000) {
            discountPercentage = 20;
        }

        double discount = (cartTotalAmount * discountPercentage) /100;

        System.out.println("Applying discount of " + discount);

        return cartTotalAmount - discount;
    }
}
