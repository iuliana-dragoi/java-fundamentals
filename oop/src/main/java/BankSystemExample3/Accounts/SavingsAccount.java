package main.java.BankSystemExample3.Accounts;
import main.java.BankSystemExample3.User.AbstractUser;
import java.util.Date;

/**
 *  Purpose: Store money and earn interest over time.
 *  Typical features:
 *      - Limited number of withdrawals/month
 *      - Accrues interest
 *  OOP Usage:
 *      - Implements InterestBearing
 *      - May restrict withdraw() usage
 *  Good for: Personal use, emergency funds, saving for goals.
 * **/

public class SavingsAccount extends Account implements InterestBearing {

    private double interestRate = 0.03;

    public SavingsAccount(int id, double balance, AbstractUser owner, int accountNumber, Date createdAt) {
        super(id, balance, owner, accountNumber, createdAt);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            throw new RuntimeException("Insufficient funds.");
        }
    }

    @Override
    public void applyInterest() {
        balance += balance * interestRate;
    }
}
