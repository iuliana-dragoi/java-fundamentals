package main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern;

public class RegularDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}
