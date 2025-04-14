package main.java.SmartEntertaimentManagementSystem.Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(String color, boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void getDescription() {
        System.out.println("A Circle with radius " + radius);
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
