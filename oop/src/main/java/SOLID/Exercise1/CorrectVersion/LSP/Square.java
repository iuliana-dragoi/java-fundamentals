package main.java.SOLID.Exercise1.CorrectVersion.LSP;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
}
