package main.java.SOLID.Exercise6.ObserverPattern;

import main.java.SOLID.Exercise6.Order;
import main.java.SOLID.Exercise6.OrderLine;

public class InventoryService implements OrderObserver {

    @Override
    public void onOrderPlaced(Order order) {
        for (OrderLine item : order.getItems()) {
            System.out.println("Removed from stock: " + item.getProduct().getName() +
                    " - Quantity: " + item.getQuantity());
        }
    }
}
