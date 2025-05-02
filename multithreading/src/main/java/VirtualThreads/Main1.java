package main.java.VirtualThreads;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            System.out.println("I am running in the Thread " + Thread.currentThread().getName());
            System.out.println("I am running in daemon Thread? " + Thread.currentThread().isDaemon());
            System.out.println();

        };

        Thread thread1 = new Thread(task);
        thread1.start();
        thread1.join();

        Thread thread2 = Thread.ofPlatform()
                .daemon()
                .name("Platform Thread 2")
                .unstarted(task);
        thread2.start();
        thread2.join();

        Thread thread3 = Thread.ofVirtual() // Is by default a daemon thread
                .name("Virtual Thread 3")
                .unstarted(task);
        thread3.start();
        thread3.join();

        Thread thread4 = Thread.startVirtualThread(task);
        thread4.join();
    }

}
