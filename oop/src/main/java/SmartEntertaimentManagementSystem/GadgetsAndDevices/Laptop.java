package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

public class Laptop extends Device {

    public Laptop(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is opening...");
    }
}
