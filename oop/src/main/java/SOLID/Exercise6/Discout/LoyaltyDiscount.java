package main.java.SOLID.Exercise6.Discout;

import main.java.SOLID.Exercise6.Order;

public class LoyaltyDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        if (order.getCustomer().isLoyal()) {
            return order.getTotal() * 0.1; // 10% discount
        }
        return 0;
    }
}
