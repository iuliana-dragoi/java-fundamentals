package main.java.SOLID.Exercise1.CorrectVersion.OCP.StrategyPattern;

/**
 The part where you have DiscountStrategy as an interface and several classes like RegularDiscount, VIPDiscount etc. is the clear application of the Strategy Pattern.
 Features:
    -Definition: "Allows choice of algorithm at runtime based on context"
    -Behavior (e.g. discount calculation) is extracted into a hierarchy of separate, interchangeable classes
    -The client calls the calculateDiscount() method without knowing which strategy is used
 **/

public interface DiscountStrategy {

    double calculateDiscount(double price);
}
