package main.java.SOLID.Exercise1.CorrectVersion.OCP;

import main.java.SOLID.Exercise1.CorrectVersion.OCP.FactoryPattern.DiscountStrategyFactory;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.DiscountStrategy;

public class Main {

    public static void main(String[] args) {
        String customerType = "Premium";
        double price = 500;

        DiscountStrategy strategy = DiscountStrategyFactory.getStrategy(customerType);
        double discount = strategy.calculateDiscount(price);
        System.out.println("Discount: " + discount);
    }
}
