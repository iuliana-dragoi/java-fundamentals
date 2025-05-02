package main.java.BanckingSystem2.Bank;

import main.java.BanckingSystem2.Operations.Transaction;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final long id;
    private BigDecimal balance; // Has exact precision
    private final Lock lock = new ReentrantLock();
    private final BlockingQueue<Transaction> transactionQueue = new LinkedBlockingQueue<>();
    private final AtomicBoolean isProcessing = new AtomicBoolean(false);
    private ExecutorService executor;

    protected Account(long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public ExecutorService getExecutor() {
        return executor;
    }

    public void setExecutor(ExecutorService executor) {
        this.executor = executor;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

    public void submitTransaction(Transaction tx) {
        transactionQueue.add(tx);
        if (isProcessing.compareAndSet(false, true)) {
            executor.submit(this::processTransactions);
        }
    }

    private void processTransactions() {
        while (true) {
            Transaction tx = transactionQueue.poll();
            if (tx == null) break;
            tx.process();
        }
        isProcessing.set(false);
        if (!transactionQueue.isEmpty() && isProcessing.compareAndSet(false, true)) {
            executor.submit(this::processTransactions);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
}
