package com.shopping.discount;

public class PremiumCustomDiscount implements Discount {

    @Override
    public double applyDiscount(double cartTotalAmount) {

        System.out.println("Total Cart Value before Discount " + cartTotalAmount);

        double discountPercentage = 0;

        if (cartTotalAmount >= 0 && cartTotalAmount < 4000) {
            discountPercentage = 10;
        } else if (cartTotalAmount >= 4000 && cartTotalAmount < 8000) {
            discountPercentage = 15;
        } else if (cartTotalAmount >= 8000 && cartTotalAmount < 12000) {
            discountPercentage = 20;
        } else if (cartTotalAmount >= 12000) {
            discountPercentage = 30;
        }

        double discount = (cartTotalAmount * discountPercentage) /100;

        System.out.println("Applying discount of " + discount);

        return cartTotalAmount - discount;
    }

}
