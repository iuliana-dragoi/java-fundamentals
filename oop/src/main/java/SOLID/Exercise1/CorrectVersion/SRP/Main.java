package main.java.SOLID.Exercise1.CorrectVersion.SRP;

import main.java.SOLID.Exercise1.CorrectVersion.SRP.EmailService;
import main.java.SOLID.Exercise1.CorrectVersion.SRP.Order;
import main.java.SOLID.Exercise1.CorrectVersion.SRP.OrderPersistence;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.DiscountStrategy;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.FactoryPattern.DiscountStrategyFactory;

public class Main {

    /**
     Order only handles order data and internal logic.
     OrderPersistence only handles persistence.
     EmailService only handles notification.
    **/

    public static void main(String[] args) {
        Order order = new Order("Laptop", 2, 1500);
        OrderPersistence orderPersistence = new OrderPersistence();
        EmailService emailService = new EmailService();

        orderPersistence.saveToFile(order);
        emailService.sendConfirmation(order);
        System.out.println("Total price: " + order.calculateTotalPrice());
    }
}
