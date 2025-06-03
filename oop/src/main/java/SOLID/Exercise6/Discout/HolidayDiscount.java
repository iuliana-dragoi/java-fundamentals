package main.java.SOLID.Exercise6.Discout;

import main.java.SOLID.Exercise6.Order;

public class HolidayDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        return order.getTotal() * 0.05; // 5% general discount
    }
}
