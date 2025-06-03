package main.java.SOLID.Exercise3;

import main.java.SOLID.Exercise3.Discounts.DiscountStrategy;
import main.java.SOLID.Exercise3.Exporter.OrderExporter;
import main.java.SOLID.Exercise3.Notifications.NotificationSender;
import main.java.SOLID.Exercise3.Orders.Order;
import main.java.SOLID.Exercise3.Orders.OrderSaver;

public class OrderProcessor {

    private final OrderSaver saver;
    private final NotificationSender sender;
    private final OrderExporter exporter;
    private final DiscountStrategy discountStrategy;

    public OrderProcessor(OrderSaver saver, NotificationSender sender, OrderExporter exporter, DiscountStrategy discountStrategy) {
        this.saver = saver;
        this.sender = sender;
        this.exporter = exporter;
        this.discountStrategy = discountStrategy;
    }

    public void process(Order order) {
        saver.save(order);
        double discount = discountStrategy.apply(order);
        double result = order.getTotal() - discount;
        order.setTotal(result);
        String content = exporter.export(order);
        sender.send(order.getClient(), content);
    }
}
