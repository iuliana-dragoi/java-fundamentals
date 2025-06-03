package main.java.SOLID.Exercise6.Discout;

import main.java.SOLID.Exercise6.Order;

import java.util.List;

public class DiscountService {

    private final List<DiscountStrategy> strategies;

    public DiscountService(List<DiscountStrategy> strategies) {
        this.strategies = strategies;
    }

    public double calculateDiscount(Order order) {
        return strategies.stream().mapToDouble(strategy -> strategy.applyDiscount(order)).sum();
    }
}
