package main.java.SOLID.Exercise3.Discounts;

import main.java.SOLID.Exercise3.Orders.Order;

public interface DiscountStrategy {

    double apply(Order order);
}
