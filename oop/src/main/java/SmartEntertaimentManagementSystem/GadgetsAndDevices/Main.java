package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

public class Main {

    public static void main(String[] args) {
        Device laptop = new Laptop("Lenovo", 1000.0);

        laptop.info();
        laptop.turnOn();

        System.out.println(laptop.convertCurrency());
        System.out.println(laptop.convertCurrency(0.90));
        System.out.println(laptop.convertCurrency("EUR", "USD"));
    }
}
