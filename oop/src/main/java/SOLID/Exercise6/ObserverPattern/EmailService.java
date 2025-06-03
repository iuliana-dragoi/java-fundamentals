package main.java.SOLID.Exercise6.ObserverPattern;

import main.java.SOLID.Exercise6.Order;

public class EmailService implements OrderObserver {

    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("Email sent to " + order.getCustomer().getEmail());
    }
}
