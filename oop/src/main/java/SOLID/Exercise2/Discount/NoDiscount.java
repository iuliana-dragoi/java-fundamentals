package main.java.SOLID.Exercise2.Discount;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double apply(double total) {
        return total;
    }
}
