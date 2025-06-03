package main.java.SOLID.Exercise1.CorrectVersion.SRP;

/**
 SRP - Single Responsibility Principle
 Order class is responsible only for order data and business logic.
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
        return this.quantity * this.pricePerUnit;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
