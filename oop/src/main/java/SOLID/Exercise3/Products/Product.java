package main.java.SOLID.Exercise3.Products;

public class Product {

    private String name;
    private double pricePerUnit;

    public Product(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
