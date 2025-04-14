package main.java.BankSystemExample3.Transations;

import main.java.BankSystemExample3.Accounts.Account;

import java.util.Date;

public abstract class Transaction {
    protected int transactionId;

    protected Account account;

    protected double amount;

    protected Date date;

    public Transaction(int transactionId, Account account, double amount, Date date) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
        this.date = date;
    }

    public Transaction(int transactionId, Account account, Date date) {
        this.transactionId = transactionId;
        this.account = account;
        this.date = date;
    }


    public abstract void process();

    public int getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
