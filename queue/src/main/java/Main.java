package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        Queue<String> q = new LinkedList<>(); // (FIFO rule)
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");

        // Remove an item
        System.out.println(q.poll());  // Expects "Apple"
    }

    public static void example2() {
        // Create a queue and enqueue items
        Queue<String> q = new LinkedList<>();
        q.add("Item 1");
        q.add("Item 2");

        // Check if the queue is non-empty, then dequeue an item
        if (!q.isEmpty()) {
            System.out.println(q.poll());  // Expects "Item 1"
        }
    }
}
