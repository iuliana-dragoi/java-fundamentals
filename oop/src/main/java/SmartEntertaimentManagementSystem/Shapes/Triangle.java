package main.java.SmartEntertaimentManagementSystem.Shapes;

public class Triangle extends Shape {

    private Double height;

    private Double base;

    public Triangle(String color, boolean filled, double height, double base) {
        super(color, filled);
        this.height = height;
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public void getDescription() {
        System.out.println("A Triangle with base=" + base + " and height=" + height);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
