package main.java.BankSystemExample3.Transations;

import main.java.BankSystemExample3.Accounts.Account;

import java.util.Date;

public class Deposit extends Transaction {

    private double amount;

    public Deposit(int transactionId, Account account, double amount, Date date) {
        super(transactionId, account, date);
        this.amount = amount;
    }

    @Override
    public void process() {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " into account " + account.getAccountNumber());
    }

}
