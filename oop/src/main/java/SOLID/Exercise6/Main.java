package main.java.SOLID.Exercise6;

import main.java.SOLID.Exercise6.Discout.*;
import main.java.SOLID.Exercise6.ObserverPattern.EmailService;
import main.java.SOLID.Exercise6.ObserverPattern.InventoryService;
import main.java.SOLID.Exercise6.ObserverPattern.LoyaltyService;
import main.java.SOLID.Exercise6.ObserverPattern.OrderNotifier;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alex", "alex@example.com");
        Product p1 = new Product("laptop", 5000);
        Product p2 = new Product("mouse", 25);

        Order order = new Order.Builder().withCustomer(customer).addItem(p1, 1).addItem(p2, 1).addCoupon("PROMO10").build();

        List<DiscountStrategy> discountStrategies = List.of(
            new LoyaltyDiscount(),
            new HolidayDiscount(),
            new CouponDiscount("PROMO10")
        );
        DiscountService discountService = new DiscountService(discountStrategies);
        double discount = discountService.calculateDiscount(order);
        double finalTotal = order.getTotal() - discount;

        System.out.println("=== Placed Order ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total: " + order.getTotal());
        System.out.println("Discount: " + discount);
        System.out.println("Final Total: " + finalTotal);

        System.out.println();

        OrderNotifier notifier = new OrderNotifier();
        notifier.addObserver(new EmailService());
        notifier.addObserver(new InventoryService());
        notifier.addObserver(new LoyaltyService());

        notifier.notify(order);

    }
}
