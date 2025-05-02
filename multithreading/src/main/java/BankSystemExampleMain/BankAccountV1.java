package main.java.BankSystemExampleMain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankAccountV1 {

    private int balance;

    public BankAccountV1(int startBalance) {
        this.balance = startBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    static class Worker implements Runnable {

        private BankAccountV1 account;

        private int workerId;

        public Worker(BankAccountV1 account, int workerId) {
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
        BankAccountV1 account = new BankAccountV1(100);

        //We submit the worker 5 times
        for(int i = 0; i < 5; i++) {
            Worker worker = new Worker(account, i);
            es.submit(worker);
        }

        es.shutdown();
    }
}
