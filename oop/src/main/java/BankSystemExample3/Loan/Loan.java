package main.java.BankSystemExample3.Loan;

import main.java.BankSystemExample3.User.Customer;

public class Loan {

    public enum Status {
        APPROVED, REJECTED, PAID, IN_PROGRESS
    }

    private double principal;
    private double interestRate;
    private int repaymentPeriodMonths;
    private Customer borrower;
    private Status status;

    public Loan(double principal, double interestRate, int repaymentPeriodMonths, Customer borrower) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.repaymentPeriodMonths = repaymentPeriodMonths;
        this.borrower = borrower;
        this.status = Status.APPROVED;
    }

    public double calculateMonthlyRepayment() {
        double totalWithInterest = principal + (principal * interestRate);
        return totalWithInterest / repaymentPeriodMonths;
    }

    public Status getStatus() {
        return status;
    }

    public void markAsPaid() {
        this.status = Status.PAID;
    }

    public Customer getBorrower() {
        return borrower;
    }

    @Override
    public String toString() {
        return "Loan of " + principal + " to " + borrower.getName() + ", Monthly Payment: " + String.format("%.2f", calculateMonthlyRepayment()) + ", Status: " + status;
    }
}
