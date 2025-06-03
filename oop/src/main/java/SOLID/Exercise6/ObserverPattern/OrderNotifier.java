package main.java.SOLID.Exercise6.ObserverPattern;

import main.java.SOLID.Exercise6.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {

    private final List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void notify(Order order) {
        for(OrderObserver observer : this.observers) {
            observer.onOrderPlaced(order);
        }
    }
}
