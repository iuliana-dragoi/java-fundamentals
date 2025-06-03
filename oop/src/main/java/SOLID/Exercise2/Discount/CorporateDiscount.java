package main.java.SOLID.Exercise2.Discount;

public class CorporateDiscount implements DiscountStrategy {

    @Override
    public double apply(double total) {
        return total * 0.9;
    }
}
