package main.java.SOLID.Exercise4.Discount;

import main.java.SOLID.Exercise4.Clients.Client;

public interface DiscountStrategy {

    double applyDiscount(Client client, double price);
}
