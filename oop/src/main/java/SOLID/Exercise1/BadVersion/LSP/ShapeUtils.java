package main.java.SOLID.Exercise1.BadVersion.LSP;

public class ShapeUtils {

    public static void resizeTo(Shape shape, int width, int height) {
        shape.setHeight(height);
        shape.setWidth(width);
        System.out.println("- Expected area: " + (width * height));
        System.out.println("- Actual area: " + shape.getArea());
    }
}
