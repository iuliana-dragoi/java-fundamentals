package main.java.SOLID.Exercise3.Orders;

import main.java.SOLID.Exercise3.Client;

import java.util.List;

public class OrderService {

    public Order createOrder(Client client, List<OrderItem> items) {
        Order order = new Order(client);
        items.forEach(order::addOrder);
        return order;
    }
}
