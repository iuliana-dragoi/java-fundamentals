package main.java.model;

import main.java.exceptions.InsufficientFundsException;

public class Account {

    private int accountNumber;

    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance+= amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Not enough funds in account");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
