package main.java.SOLID.Exercise2.ProductProcess;

public class Product {

    private String name;
    private double priceUnit;
    private String code;

    public Product(String name, double priceUnit, String code) {
        this.name = name;
        this.priceUnit = priceUnit;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
