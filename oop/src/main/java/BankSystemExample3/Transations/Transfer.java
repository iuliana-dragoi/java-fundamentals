package main.java.BankSystemExample3.Transations;

import main.java.BankSystemExample3.Accounts.Account;

import java.util.Date;

public class Transfer extends Transaction {

    private Account destinationAccount;
    private double amount;


    public Transfer(int transactionId, Account sourceAccount, Account destinationAccount, double amount, Date date) {
        super(transactionId, sourceAccount, date);
        this.amount = amount;
        this.destinationAccount = destinationAccount;
    }

    @Override
    public void process() {
        account.withdraw(amount);
        destinationAccount.deposit(amount);
        System.out.println("Transferred " + amount + " from account " + account.getAccountNumber() +
                " to account " + destinationAccount.getAccountNumber());
    }
}
