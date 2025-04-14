package main.java.BankSystemExample3;

import main.java.BankSystemExample3.Accounts.BusinessAccount;
import main.java.BankSystemExample3.Accounts.CheckingAccount;
import main.java.BankSystemExample3.Accounts.SavingsAccount;
import main.java.BankSystemExample3.Loan.Loan;
import main.java.BankSystemExample3.Loan.LoanApplication;
import main.java.BankSystemExample3.Transations.Deposit;
import main.java.BankSystemExample3.Transations.Transfer;
import main.java.BankSystemExample3.Transations.Withdrawal;
import main.java.BankSystemExample3.User.Customer;
import main.java.BankSystemExample3.User.Employee;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        example1();
//        example2();
        loanExample();
    }

    public static void example1() {
        Customer customer1 = new Customer(1, "John", "john@example.com");
        Employee customer2 = new Employee(2, "Alice", "alice@example.com", "Tesla");

        SavingsAccount savingsAccount = new SavingsAccount(1, 0.0, customer1, 10, new Date());
        savingsAccount.deposit(100);
        savingsAccount.applyInterest();
        double balance1 = savingsAccount.getBalance();
        System.out.println(customer1.getProfileInfo() + " Balance:" + balance1);

        CheckingAccount checkingAccount = new CheckingAccount(1, 0.0, customer2, 20, new Date(), true);
        checkingAccount.deposit(500);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(286);
        checkingAccount.withdraw(500);
        double balance2 = checkingAccount.getBalance();
        System.out.println(customer2.getProfileInfo() + " Balance:" + balance2);

        BusinessAccount businessAccount = new BusinessAccount(3, 0.0, customer1, 30, new Date());
        businessAccount.deposit(10000);
        businessAccount.addAuthorizedUser(customer2); // Add a second user to the business account
        if (businessAccount.isUserAuthorized(customer2)) {
            System.out.println(customer2.getProfileInfo() + " is authorized on the business account.");
        } else {
            System.out.println(customer2.getProfileInfo() + " is not authorized on the business account.");
        }
        System.out.println(customer1.getProfileInfo() + " - Business Account Balance: " + businessAccount.getBalance());
    }

    public static void example2() {

        Customer customer1 = new Customer(1, "John", "john@example.com");
        Employee customer2 = new Employee(2, "Alice", "alice@example.com", "Tesla");

        SavingsAccount savingsAccount = new SavingsAccount(1, 0.0, customer1, 10, new Date());
        Deposit deposit1 = new Deposit(1, savingsAccount, 1000, new Date());
        deposit1.process();
        savingsAccount.applyInterest();
        System.out.println(customer1.getProfileInfo() + " - Savings Account Balance: " + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(1, 0.0, customer2, 20, new Date(), true);
        Deposit deposit2 = new Deposit(1, checkingAccount, 1000, new Date());
        deposit2.process();
        Withdrawal withdrawal1 = new Withdrawal(1, checkingAccount, 600, new Date());
        withdrawal1.process();
        System.out.println(customer1.getProfileInfo() + " - Checking Account Balance: " + checkingAccount.getBalance());

        Transfer transfer1 = new Transfer(1, savingsAccount, checkingAccount, 200, new Date()); // Transfer from savings to checking
        transfer1.process();

        System.out.println(customer1.getProfileInfo() + " - Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println(customer1.getProfileInfo() + " - Checking Account Balance: " + checkingAccount.getBalance());
    }

    public static void loanExample() {
        Customer customer1 = new Customer(1, "Alice", "alice@example.com", 30000, false);
        Customer customer2 = new Customer(2, "Bob", "bob@example.com", 15000, true);

        LoanApplication loanApp = new LoanApplication(10000, 0.05, 12);

        customer1.applyForLoan(loanApp);
        customer2.applyForLoan(loanApp);

        for (Loan loan : customer1.getActiveLoans()) {
            System.out.println(loan);
        }
    }
}
