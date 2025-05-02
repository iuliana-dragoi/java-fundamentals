package main.java.BankingSystem1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankAccountV3 {

    private int balance;

    public BankAccountV3(int startBalance) {
        this.balance = startBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdrawal(int amount) {
        balance -= amount;
    }

    // Is responsible to perform exactly one Transaction against the Bank account.
    static class TxWorker implements Runnable {

        protected BankAccountV3 account;

        protected char txType; // 'w' -> withdrawal, 'd' -> deposit.

        protected int amt;

        protected int workerId;

        public TxWorker(BankAccountV3 account, char txType, int amt, int workerId) {
            this.account = account;
            this.txType = txType;
            this.amt = amt;
            this.workerId = workerId;
        }

        //Our run method will deposit 10 dollars 10 times.
        @Override
        public void run() {
            System.out.println("TxWorker " + workerId + " runs. Transaction Type: " + txType + " Amount: " + amt);
            if(txType == 'w') {
                account.withdrawal(amt);
            } else if(txType == 'd') {
                account.deposit(amt);
            }
        }
    }

    static class TxPromoWorker extends TxWorker {

        public TxPromoWorker(BankAccountV3 account, char txType, int amt, int workerId) {
            super(account, txType, amt, workerId);
        }

        @Override
        public void run() {
            System.out.println("TxPromoWorker " + workerId + " runs. Transaction Type: " + txType + " Amount: " + amt);
            if(txType == 'w') {
                account.withdrawal(amt);
            } else if(txType == 'd') {
                synchronized (account) {
                    account.deposit(amt);
                    if(account.getBalance() > 500) {
                        int bonus = (int)((account.getBalance() - 500) * 0.1); // to get 10%
                        account.deposit(bonus);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(5);
        TxWorker[] workers = new TxPromoWorker[3];
        BankAccountV3 account = new BankAccountV3(100);

        // Create an instance of Random for random generation
        Random random = new Random();

        // Create and submit workers with random transaction types
        for(int i = 0; i < workers.length; i++) {
            // Randomly choose 'd' (deposit) or 'w' (withdrawal)
            char txType = random.nextBoolean() ? 'd' : 'w';
            workers[i] = new TxPromoWorker(account, txType, 50, i);
            es.submit(workers[i]);
        }

        System.out.println("Balance: " + account.getBalance());

        // Shut down the executor service gracefully
        es.shutdown();

        // Wait for all tasks to finish
        if (!es.awaitTermination(60, TimeUnit.SECONDS)) {
            es.shutdownNow();
        }

        // After all workers have finished, print the balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
