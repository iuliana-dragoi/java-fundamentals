package main.java.SOLID.Exercise6.ObserverPattern;

import main.java.SOLID.Exercise6.Order;

public interface OrderObserver {

    void onOrderPlaced(Order order);
}
