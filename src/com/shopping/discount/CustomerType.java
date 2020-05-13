package com.shopping.discount;

public enum CustomerType {

    REGULAR(new RegularCustomerDiscount()),

    PREMIUM(new PremiumCustomDiscount());

    private final Discount discount;

    CustomerType(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }
}
