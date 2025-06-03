package main.java.SOLID.Exercise1.CorrectVersion.LSP;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }
}
