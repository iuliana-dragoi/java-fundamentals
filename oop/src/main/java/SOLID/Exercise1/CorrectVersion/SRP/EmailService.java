package main.java.SOLID.Exercise1.CorrectVersion.SRP;

/**
 SRP - Single Responsibility Principle
 EmailService class is responsible only for sending the Email.
 **/

public class EmailService {

    public void sendConfirmation(Order order) {
        System.out.println("Sending email confirmation for order of: " + order.getProduct());
    }
}
