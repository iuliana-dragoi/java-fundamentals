package main.java.Examples.Cafe;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderManagement {

    private Deque<Integer> orderQueue;

    public OrderManagement() {
        this.orderQueue = new ArrayDeque<>();
    }

    public void addOrder(int orderId) {
        orderQueue.add(orderId);
    }

    public int serveOrder() throws Exception  {
        if(orderQueue.isEmpty()) {
            throw new Exception("There are no orders!");
        }
        else {
            return orderQueue.remove();
        }
    }
}
