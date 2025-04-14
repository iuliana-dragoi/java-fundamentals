package main.java.BankSystemExample3.Accounts;

import main.java.BankSystemExample3.User.AbstractUser;

import java.util.Date;

public abstract class Account {

    protected int id;

    protected double balance;

    protected AbstractUser owner;

    protected int accountNumber;

    protected Date createdAt;

    public Account(int id, double balance, AbstractUser owner, int accountNumber, Date createdAt) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.createdAt = createdAt;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public AbstractUser getOwner() {
        return owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
