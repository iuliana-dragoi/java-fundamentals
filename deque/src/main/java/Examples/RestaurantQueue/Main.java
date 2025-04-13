package main.java.Examples.RestaurantQueue;

public class Main {

    public static void main(String[] args) {
        Queue restaurantQueue = new Queue();

        restaurantQueue.enqueue("Order 1");
        restaurantQueue.enqueue("Order 2");

        System.out.println("Dequeued: " + restaurantQueue.dequeue());
        System.out.println("Dequeued: " + restaurantQueue.dequeue());
    }
}
