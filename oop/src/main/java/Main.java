package main.java;

import main.java.BankSystemExample1.exceptions.InsufficientFundsException;
import main.java.BankSystemExample1.exceptions.InvalidAccountException;
import main.java.BankSystemExample1.model.Account;
import main.java.BankSystemExample1.model.Bank;
import main.java.BankSystemExample1.model.Customer;

public class Main {

    public static void main(String[] args) {

       try {
           Bank bank = new Bank();

           bank.createCustomer("Iuliana", "iuliana@test.com");
           bank.createCustomer("Florin", "florin@test.com");

           Customer iuliana = bank.getCustomer("iuliana@test.com");
           Customer florin = bank.getCustomer("florin@test.com");

           Account iulianaAccount = new Account(1, 5000);
           Account florinAccount = new Account(2, 5000);

           iuliana.addAccount(iulianaAccount);
           florin.addAccount(florinAccount);

           bank.transferMoney(2, 1, 200.0);

           System.out.println("Iulianas's new balance: " + iulianaAccount.checkBalance());
           System.out.println("Florin's new balance: " + florinAccount.checkBalance());

       } catch (InvalidAccountException e) {
           throw new RuntimeException(e);
       } catch (InsufficientFundsException e) {
           throw new RuntimeException(e);
       }
    }
}
