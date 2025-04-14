package main.java.BankSystemExample3.Transations;

import main.java.BankSystemExample3.Accounts.Account;

import java.util.Date;

public class Withdrawal extends Transaction {

    private double amount;

    public Withdrawal(int transactionId, Account account, double amount, Date date) {
        super(transactionId, account, date);
        this.amount = amount;
    }

    @Override
    public void process() {
        account.withdraw(amount);
        System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
    }
}
