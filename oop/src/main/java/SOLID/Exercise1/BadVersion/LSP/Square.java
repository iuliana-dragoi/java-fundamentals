package main.java.SOLID.Exercise1.BadVersion.LSP;

public class Square extends Shape {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // The square has equal sides
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // The square has equal sides
    }
}
