package main.java.SOLID.Exercise1.CorrectVersion.LSP;

public class Main {

    /**
     We shouldn't force inheritance if derived classes don't respect the semantics of the parent class
     Square and Rectangle are different shapes, so it's more correct to be siblings, not parent–child
     I moved setWidth() / setHeight() outside because moving state led to inconsistencies
    **/

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(10);

        ShapeUtils.printArea(rectangle);
        ShapeUtils.printArea(square);
    }
}
