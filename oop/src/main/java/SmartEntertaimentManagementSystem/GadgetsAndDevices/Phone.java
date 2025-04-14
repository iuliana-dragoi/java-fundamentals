package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

public class Phone extends Device {

    public Phone(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is opening...");
    }
}
