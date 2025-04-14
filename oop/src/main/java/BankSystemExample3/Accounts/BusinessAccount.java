package main.java.BankSystemExample3.Accounts;

import main.java.BankSystemExample3.User.AbstractUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  Purpose: Designed for business financial operations
 *  Typical features:
 *      - Higher limits
 *      - May include loan or credit features
 *      - May support multiple authorized users
 *      -  Custom fees
 *  OOP Usage:
 *      - May include features like requestLoan() or addAuthorizedUser()
 *      - Can be a subclass of Account, or extend a CorporateAccount class
 *  Good for: Companies, freelancers, legal entities
 **/

public class BusinessAccount extends Account {

    private List<AbstractUser> authorizedUsers  = new ArrayList<>();

    public BusinessAccount(int id, double balance, AbstractUser owner, int accountNumber, Date createdAt) {
        super(id, balance, owner, accountNumber, createdAt);
        authorizedUsers.add(owner);  // by default, the owner is authorized
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

    public void addAuthorizedUser(AbstractUser user) {
        if(!authorizedUsers.contains(user)) {
            authorizedUsers.add(user);
        }
    }

    public void removeAuthorizedUser(AbstractUser user) {
        authorizedUsers.remove(user);
    }

    public boolean isUserAuthorized(AbstractUser user) {
        return authorizedUsers.contains(user);
    }
}
