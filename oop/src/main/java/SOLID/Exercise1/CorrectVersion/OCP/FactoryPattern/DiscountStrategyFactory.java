package main.java.SOLID.Exercise1.CorrectVersion.OCP.FactoryPattern;

import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.PremiumDiscount;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.RegularDiscount;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.VipDiscount;
import main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern.DiscountStrategy;

/**
 When we use a class like DiscountStrategyFactory to instantiate objects based on a parameter,
 we are applying the Factory Method Pattern.
 Features:
    -Hide object creation logic
    -Separate the code that decides what type of object to create from the code that uses that object
    -OCP compliant (you can add new strategies without changing the consuming code)
 **/

public class DiscountStrategyFactory {

    public static DiscountStrategy getStrategy(String customerType) {
        return switch (customerType) {
          case "Regular" -> new RegularDiscount();
          case "Premium" -> new PremiumDiscount();
          case "VIP" -> new VipDiscount();
          default -> price -> 0;
        };
    }
}
