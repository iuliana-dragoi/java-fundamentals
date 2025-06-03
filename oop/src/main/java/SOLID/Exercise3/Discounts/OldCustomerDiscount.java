package main.java.SOLID.Exercise3.Discounts;

import main.java.SOLID.Exercise3.Orders.Order;

public class OldCustomerDiscount implements DiscountStrategy {

    @Override
    public double apply(Order order) {
        return order.getTotal() * 0.2;
    }
}
