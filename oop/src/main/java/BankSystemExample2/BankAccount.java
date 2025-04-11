package main.java.BankSystemExample2;

import main.java.BankSystemExample1.model.Bank;

public class BankAccount {

    private int accountNo;
    private double balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            this.balance -= +amount;
        }
        else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += +amount;
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double checkBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, 5000000);
        account.withdraw(12000);
        account.deposit(89);
        System.out.println(account.checkBalance());
    }

}
