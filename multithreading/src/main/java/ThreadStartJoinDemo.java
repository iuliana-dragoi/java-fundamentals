package main.java;

public class ThreadStartJoinDemo {

    static class Worker implements Runnable {

        private final String name;

        Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " started on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Work simulation.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished on " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[3];
        System.out.println("Main thread: starting workers...");

        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new Worker("Worker-" + i));
            threads[i].start(); // Starts immediately
        }

        System.out.println("Main thread: all workers started, now waiting for them...");

        for (Thread thread : threads) {
            thread.join(); // ⏳ main thread waits
        }

        System.out.println("Main thread: all workers done.");
    }
}
