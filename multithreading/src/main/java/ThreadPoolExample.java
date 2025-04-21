package main.java;

import java.util.concurrent.*;

public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 Threads.

        for(int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskId + " in thread " + Thread.currentThread().getName());
            });

        }

        executor.shutdown(); // shutdown after tasks finish
    }
}
