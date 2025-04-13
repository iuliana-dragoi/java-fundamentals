package main.java.Examples.RestaurantQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

    private Deque<String> buffer;

    public Queue() {
        buffer = new ArrayDeque<>();
    }

    // Adding (enqueueing) an item to the queue
    public void enqueue(String val) {
        buffer.addLast(val);
    }

    // Removing (dequeuing) an item from the queue
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return buffer.removeFirst();
    }

    public boolean isEmpty() {
        return buffer.isEmpty();
    }

    public int size() {
        return buffer.size();
    }

}
