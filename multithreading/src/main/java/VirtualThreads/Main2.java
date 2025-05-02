package main.java.VirtualThreads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        var set = ConcurrentHashMap.<String>newKeySet();
        Runnable task = () -> set.add(Thread.currentThread().toString());

        int N_TASKS = 1000;
//        try(var es1 = Executors.newFixedThreadPool(10)) {
        try(var es1 = Executors.newVirtualThreadPerTaskExecutor()) {
            // creates virtual threads on demand and let them die at the end/
            for(int index = 0; index < N_TASKS; index++) {
                es1.submit(task);
            }
        }

        System.out.println("# threads uses = " + set.size());
    }


}
