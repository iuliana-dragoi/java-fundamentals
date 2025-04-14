package main.java.BankSystemExample3.Accounts;

import main.java.BankSystemExample3.User.AbstractUser;

import java.util.Date;

/**
 *  Purpose: Frequent transactions like deposits, withdrawals, bill payments.
 *  Typical features:
 *      - No interest (or very low)
 *      - Unlimited transactions
 *      - May include overdraft features
 *  OOP Usage:
 *      - Simple withdraw() and deposit() logic
 *      - Usually doesn’t implement InterestBearing
 *  Good for: Everyday use
 **/

public class CheckingAccount extends Account {

    private boolean overdraftEnabled;

    public CheckingAccount(int id, double balance, AbstractUser owner, int accountNumber, Date createdAt, boolean overdraftEnabled) {
        super(id, balance, owner, accountNumber, createdAt);
        this.overdraftEnabled = overdraftEnabled;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else if(overdraftEnabled) {
            balance -= amount; //  overdraft means the account can go below zero balance, allowing you to spend more than you have — usually with fees or interest.
        }
        else {
            throw new RuntimeException("Insufficient funds and no overdraft allowed.");
        }
    }

}
