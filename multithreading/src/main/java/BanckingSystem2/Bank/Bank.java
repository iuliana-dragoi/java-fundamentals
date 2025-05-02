package main.java.BanckingSystem2.Bank;

import main.java.BanckingSystem2.Operations.DepositTransaction;
import main.java.BanckingSystem2.Operations.Transaction;
import main.java.BanckingSystem2.Operations.TransferTransaction;
import main.java.BanckingSystem2.Operations.WithdrawTransaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

    private List<Account> accounts = new ArrayList<Account>();

    private final ExecutorService executorService;

    public Bank(int numberOfThreads) {
        this.executorService = Executors.newFixedThreadPool(numberOfThreads);
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public Account createAccount(BigDecimal balance) {
        long id = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        Account account = new Account(id, balance);
        account.setExecutor(executorService);
        addAccount(account);
//        System.out.println("Account created: " + account);
        return account;
    }

    private void addAccount(Account account) {
        accounts.add(account);
    }

    public Transaction deposit(Account account, BigDecimal amount) {
        return new DepositTransaction(account, amount);
    }

    public Transaction withdraw(Account account, BigDecimal amount) {
        return new WithdrawTransaction(account, amount);
    }

    public Transaction transfer(Account from, Account to, BigDecimal amount) {
        return new TransferTransaction(from, to, amount);
    }

    public void executorShutDown() {
        this.executorService.shutdown();
    }
}
