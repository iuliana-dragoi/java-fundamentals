package main.java.model;

import main.java.exceptions.InsufficientFundsException;
import main.java.exceptions.InvalidAccountException;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Customer> customers;

    public Bank() {
        customers = new HashMap<>();
    }

    public void createCustomer(String name, String email) {
        customers.put(email, new Customer(name, email));
    }

    public Customer getCustomer(String email) throws InvalidAccountException {
        if(!customers.containsKey(email)) {
            throw new InvalidAccountException("Customer not found");
        }
        return customers.get(email);
    }

    public void transferMoney(int fromAccountNumber, int toAccountNumber, double amount) throws InvalidAccountException, InsufficientFundsException {

        Account fromAccount = null;
        Account inAccount = null;

        for(Customer customer : customers.values()) {

            try {
                if(fromAccount == null) {
                    fromAccount = customer.getAccount(fromAccountNumber);
                }

                if(inAccount == null) {
                    inAccount = customer.getAccount(toAccountNumber);
                }
                break;

            } catch (InvalidAccountException e) {
                continue;
            }
        }

        if(fromAccount == null || inAccount == null) {
            throw new InvalidAccountException("One or both accounts not found");
        }

        fromAccount.withdraw(amount);
        inAccount.deposit(amount);
    }
}
