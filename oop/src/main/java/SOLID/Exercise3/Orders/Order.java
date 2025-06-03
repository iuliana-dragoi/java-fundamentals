package main.java.SOLID.Exercise3.Orders;

import main.java.SOLID.Exercise3.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Order {

    private Client client;
    private List<OrderItem> items;

    private double total;

    public Order(Client client) {
        this.client = client;
        this.items = new ArrayList<>();
    }

    public void addOrder(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotal() {
        Function<OrderItem, Double> processOrder = (orderItem) -> {
            double price = orderItem.getProduct().getPricePerUnit();
            double result = orderItem.getQuantity() * price;
            return result;
        };
        Double result = items.stream().map(processOrder).reduce(0.0, Double::sum);
        return result;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
