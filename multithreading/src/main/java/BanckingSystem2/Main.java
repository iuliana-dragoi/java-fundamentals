package main.java.BanckingSystem2;

import main.java.BanckingSystem2.Bank.Account;
import main.java.BanckingSystem2.Bank.Bank;
import main.java.BanckingSystem2.Operations.DepositTransaction;
import main.java.BanckingSystem2.Operations.Transaction;
import main.java.BanckingSystem2.Operations.TransferTransaction;
import main.java.BanckingSystem2.Operations.WithdrawTransaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        example2();

        long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        double durationInMillis = durationInNano / 1_000_000.0;

        System.out.println("Total execution time: " + durationInMillis + " ms");
    }

    public static void example1() {
        Bank bank = new Bank(32);
        Account account1 = bank.createAccount(new BigDecimal("100"));
        Account account2 = bank.createAccount(new BigDecimal("520"));

        // Sent sequential transaction per account, but concurrent between accounts.
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("50")));
        account1.submitTransaction(bank.withdraw(account1, new BigDecimal("58")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("50")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("100")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("150")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("250")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("350")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("650")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("850")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("900")));
        account1.submitTransaction(bank.deposit(account1, new BigDecimal("1000")));
        account1.submitTransaction(bank.withdraw(account1, new BigDecimal("1050")));

        account2.submitTransaction(bank.deposit(account2, new BigDecimal("900")));
        account2.submitTransaction(bank.deposit(account2, new BigDecimal("10000000")));
        account2.submitTransaction(bank.withdraw(account2, new BigDecimal("1050")));

        Transaction transfer = new TransferTransaction(account1, account2, new BigDecimal("100"));
        account1.submitTransaction(transfer);

        bank.executorShutDown();
    }

    public static void example2() {
        //🧾 Accounts: 1,000,000
        //🔁 Transactions: 10 per cont → 10,000,000 total transactions
        //🔧 Threads: 64
        //⏱️ Timp total: 14.03 secunde

        Bank bank = new Bank(64);

        int numberOfAccounts = 1_000_000;
        int transactionsPerAccount = 10;

        List<Account> accounts = new ArrayList<>();
        // Step 1: Create 100 accounts
        for (int i = 0; i < numberOfAccounts; i++) {
            Account account = bank.createAccount(new BigDecimal("1000")); // initial balance
            accounts.add(account);
        }

        // Step 2: Submit 10 transactions per account
        for (Account account : accounts) {
            for (int t = 0; t < transactionsPerAccount; t++) {
                BigDecimal amount = BigDecimal.valueOf((int) (Math.random() * 500 + 1)); // random 1–500
                Transaction tx;
                if (Math.random() < 0.5) {
                    tx = new DepositTransaction(account, amount);
                } else {
                    tx = new WithdrawTransaction(account, amount);
                }
                account.submitTransaction(tx);
            }
        }

        // Optionally wait before shutting down executor
        try {
            Thread.sleep(5000); // wait for transactions to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bank.executorShutDown();
    }
}
