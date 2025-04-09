package main.java.model;

import main.java.exceptions.InvalidAccountException;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    String name;

    String email;

    List<Account> accountList;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    public Account getAccount(int accountNumber) throws InvalidAccountException {
        for(Account account: this.accountList) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new InvalidAccountException("Account not found");
    }
}
