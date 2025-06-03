package main.java.SOLID.Exercise6.ObserverPattern;

import main.java.SOLID.Exercise6.Order;

public class LoyaltyService implements OrderObserver {

    @Override
    public void onOrderPlaced(Order order) {
        double points = order.getTotal() / 10; // 1 point for 10 euros
        System.out.println("Customer " + order.getCustomer().getName() +
                " received " + points + " loyality points.");
    }
}
