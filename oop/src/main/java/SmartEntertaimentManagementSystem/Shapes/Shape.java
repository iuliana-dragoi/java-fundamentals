package main.java.SmartEntertaimentManagementSystem.Shapes;

public abstract class Shape {

    private String color;

    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void describe() {
        System.out.println("A " + (filled ? "filled" : "hollow") + " shape in " + color);
    }

    public abstract void getDescription();
    public abstract double getArea();
    public abstract double getPerimeter();
}
