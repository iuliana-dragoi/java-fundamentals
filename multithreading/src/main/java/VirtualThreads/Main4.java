package main.java.VirtualThreads;

import java.util.concurrent.Executors;

public class Main4 {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
          System.out.println("I am running in the thread " + Thread.currentThread());
        };

        var thread = Thread.ofVirtual()
            .name("My virtual thread")
            .unstarted(task);

        thread.start();
        thread.join();

        try (var es = Executors.newVirtualThreadPerTaskExecutor()){
            es.submit(task);
        }
    }

}
