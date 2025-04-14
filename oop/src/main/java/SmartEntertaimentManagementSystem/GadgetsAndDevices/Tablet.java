package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

public class Tablet extends Device {

    public Tablet(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet is opening...");

    }
}
