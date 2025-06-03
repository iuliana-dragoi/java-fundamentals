package main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern;

public class VipDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
