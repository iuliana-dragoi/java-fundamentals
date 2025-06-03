package main.java.SOLID.Exercise4.Discount;

import main.java.SOLID.Exercise4.Clients.Client;

public class VipDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(Client client, double price) {
        return price * 0.10;
    }
}
