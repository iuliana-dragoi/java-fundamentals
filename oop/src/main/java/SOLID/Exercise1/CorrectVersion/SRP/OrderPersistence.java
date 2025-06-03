package main.java.SOLID.Exercise1.CorrectVersion.SRP;

/**
 SRP - Single Responsibility Principle
 OrderPersistence class is responsible only for saving the order.
 **/

public class OrderPersistence {

    public void saveToFile(Order order) {
        System.out.println("Saving order for product: " + order.getProduct());
    }
}
