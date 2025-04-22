package main.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankAccount {

    private int balance;

    public BankAccount(int startBalance) {
        this.balance = startBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    static class Worker implements Runnable {

        private BankAccount account;

        private int workerId;

        public Worker(BankAccount account, int workerId) {
            this.account = account;
            this.workerId = workerId;
        }

        //Our run method will deposit 10 dollars 10 times.
        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                int startBalance = account.getBalance();
                System.out.println();
                account.deposit(10);
                int endBalance = account.getBalance();
                System.out.println("Worker " + workerId + " " + " startBalance " + startBalance + " endBalance " + endBalance);
            }
        }
    }

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount(100);

        //We submit the worker 5 times
        for(int i = 0; i < 5; i++) {
            Worker worker = new Worker(account, i);
            es.submit(worker);
        }

        es.shutdown();
    }
}
