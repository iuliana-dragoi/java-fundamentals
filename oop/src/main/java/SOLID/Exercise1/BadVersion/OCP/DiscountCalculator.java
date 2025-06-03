package main.java.SOLID.Exercise1.BadVersion.OCP;

/**
 OCP - Open/Closed Principle (not respected)
 If you add a new customer type (ex: "Student"), you have to modify this class ⇒ violates OCP.
 **/

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double price) {
        double result = 0;
        switch (customerType) {
            case "Regular":
                result = price * 0.05;
                break;
            case "Premium":
                result = price * 0.10;
                break;
            case "VIP":
                result = price * 0.20;
                break;
            default:
                System.out.println("Invalid size number");
        }
        return result;
    }
}
