package main.java.SOLID.Exercise6.Discout;

import main.java.SOLID.Exercise6.Order;

public interface DiscountStrategy {

    double applyDiscount(Order order);
}
