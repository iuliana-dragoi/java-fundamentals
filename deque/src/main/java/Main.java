package main.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    public static void example1() {
        // Create a deque and add items
        Deque<String> d = new ArrayDeque<>();
        d.addLast("Middle");
        d.addLast("Right end");
        d.addFirst("Left end");

        // Remove an item
        System.out.println(d.removeLast());  // Expects "Right end"

        // Remove an item from the left
        System.out.println(d.removeFirst()); // Expects "Left end"
    }

    public static void example2() {
        // Create a deque
        Deque<String> d = new ArrayDeque<>();
        d.addLast("Apple");
        d.addLast("Banana");
        d.addLast("Cherry");

        // Rotate the deque to the right by 1 place
        for (int i = 0; i < 1; i++) {
            d.addFirst(d.removeLast());
        }

        System.out.println(d);  // Expects [Cherry, Apple, Banana]
    }

    public static void example3() {
        Deque<String> fruitDeque = new ArrayDeque<>();
        fruitDeque.add("Apple");
        fruitDeque.add("Banana");
        fruitDeque.add("Mango");
        fruitDeque.add("Orange");

        //Rotate right
        String last = fruitDeque.removeLast();
        fruitDeque.addFirst(last);

        //Rotate left
        String first = fruitDeque.removeFirst();
        fruitDeque.addLast(first);

        System.out.println(first);
    }
}
