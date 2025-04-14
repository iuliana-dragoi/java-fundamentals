package main.java.SmartEntertaimentManagementSystem.GadgetsAndDevices;

public abstract class Device {

    private String brand;

    private Double price;

    public Device(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void info() {
        System.out.println("Brand: " + brand);
    }

    public double convertCurrency() {
        double rate = 0.85;
        return this.price * rate;
    }

    public double convertCurrency(double rate) {
        return this.price * rate;
    }

    public double convertCurrency(String from, String to) {
        if (from.equals("USD") && to.equals("EUR")) return price * 0.85;
        if (from.equals("EUR") && to.equals("USD")) return price * 1.18;
        return price;
    }

    public abstract void turnOn();
}
