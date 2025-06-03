package main.java.SOLID.Exercise1.BadVersion.LSP;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        System.out.println("Rectangle:");
        ShapeUtils.resizeTo(rectangle, 5, 10); // OK

        System.out.println("Square:");
        ShapeUtils.resizeTo(square, 5, 10); // Problem: Area = 100, not 25

        /**
         Square violates LSP: you can no longer use Square instead of Shape without unexpected effects.
         resizeTo sets width ≠ height, but Square forces them to be equal.
        **/
    }
}
