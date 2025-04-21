package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FileEditorApp {

    static class FileEditorTask implements Runnable {

        private final String fileName;

        FileEditorTask(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            System.out.println("Editing started: " + fileName + " - " + Thread.currentThread().getName());
        }
    }

    static class FileEditorCallable implements Callable<Integer> {

        private final String fileName;

        FileEditorCallable(String fileName) {
            this.fileName = fileName;
        }

        private int process() {
            return fileName.length();
        }

        @Override
        public Integer call() throws Exception {
            System.out.println("Editing file (with return): " + fileName + " - " + Thread.currentThread().getName());
            Thread.sleep(500);
            return process();
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //example1();
        //example2();
        example3();
    }

    public static void example1() throws InterruptedException {
        String[] files = {
            "file1.txt",
            "file2.txt",
            "file3.txt",
            "file4.txt",
            "file5.txt"
        };

        Thread[] threads = new Thread[files.length];
        int i = 0;

        for (String file : files) {
            FileEditorTask task = new FileEditorTask(file);
            threads[i] = new Thread(task);
            threads[i].start(); // New Thread -> Scheduler -> runs parallel.
            i++;
        }

        for(Thread thread : threads)  {
            thread.join(); // Waits for thread to finish
        }
    }

    public static void example2() throws InterruptedException {
        String[] files = {
            "file1.txt",
            "file2.txt",
            "file3.txt",
            "file4.txt",
            "file5.txt"
        };

        ExecutorService es = Executors.newFixedThreadPool(3); // Creates a thread pool that never allows more than 3 threads at a time to exist.
        for (String file : files) {
            FileEditorTask task = new FileEditorTask(file);
            es.submit(task); // the thread pool takes the work and assign them to Threads to do the work but never more than three of them running at the same time.
        }

        es.shutdown(); // finish the work that is already assigned to the pool but don't allow new work to be assigned into the pool.
        es.awaitTermination(60, TimeUnit.SECONDS); // we wait 60s for the pool to shut down
    }

    public static void example3() throws InterruptedException {
        String[] files = {
            "file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt"
        };

        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();

        for (String file : files) {
            FileEditorCallable task = new FileEditorCallable(file);
            Future<Integer> future = es.submit(task); // Submit Callable, get Future
            futures.add(future);
        }

        for (Future<Integer> future : futures) {

            Integer result = null; // Blocks until the task is done
            try {
                result = future.get();
                System.out.println("Result from file editing task: " + result);

            } catch (ExecutionException e) {
                Throwable ex = e.getCause();
                System.out.println(ex);
            }
        }

        //es.shutdown();
        es.awaitTermination(60, TimeUnit.SECONDS);
    }
}
