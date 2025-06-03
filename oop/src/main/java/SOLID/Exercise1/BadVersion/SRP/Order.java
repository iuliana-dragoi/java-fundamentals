package main.java.SOLID.Exercise1.BadVersion.SRP;

/**
 SRP - Single Responsibility Principle (not respected)
 We can see that this class has 3 responsibilities
 - Order Data Management
 - Save to File
 - Send Email
**/

public class Order {

    private String product;
    private int quantity;
    private double pricePerUnit;

    public Order(String product, int quantity, double pricePerUnit) {
        this.product = product;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }

    public void saveToFile() {
        System.out.println("Save to file.");
    }

    public void sendEmailConfirmation() {
        System.out.println("Email confirmation sent.");
    }



}
