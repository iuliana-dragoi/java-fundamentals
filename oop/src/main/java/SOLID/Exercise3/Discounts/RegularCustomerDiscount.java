package main.java.SOLID.Exercise3.Discounts;

import main.java.SOLID.Exercise3.Orders.Order;

public class RegularCustomerDiscount implements DiscountStrategy {

    @Override
    public double apply(Order order) {
        return 0;
    }
}
