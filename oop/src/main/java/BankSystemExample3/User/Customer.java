package main.java.BankSystemExample3.User;

import main.java.BankSystemExample3.Loan.Loan;
import main.java.BankSystemExample3.Loan.LoanApplication;
import main.java.BankSystemExample3.Loan.LoanEligible;
import java.util.ArrayList;
import java.util.List;

public class Customer extends AbstractUser implements LoanEligible {

    private double annualIncome;
    private boolean hasBadCredit;
    private List<Loan> activeLoans = new ArrayList<>();

    public Customer(int id, String name, String email) {
        super(id, name, email);
    }

    public Customer(int id, String name, String email, double annualIncome, boolean hasBadCredit) {
        super(id, name, email);
        this.annualIncome = annualIncome;
        this.hasBadCredit = hasBadCredit;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public boolean isHasBadCredit() {
        return hasBadCredit;
    }

    public void setHasBadCredit(boolean hasBadCredit) {
        this.hasBadCredit = hasBadCredit;
    }

    public List<Loan> getActiveLoans() {
        return activeLoans;
    }

    public void setActiveLoans(List<Loan> activeLoans) {
        this.activeLoans = activeLoans;
    }

    @Override
    public String getProfileInfo() {
        return "Customer with ID: " + this.id + ", Name: " + this.name + ", Email: " + this.email;
    }

    @Override
    public boolean isEligible() {
        return annualIncome >= 20000 && !hasBadCredit;
    }

    @Override
    public void applyForLoan(LoanApplication application) {
        if (isEligible()) {
            Loan loan = new Loan(application.getLoanAmount(), application.getInterestRate(), application.getRepaymentPeriodMonths(), this);
            activeLoans.add(loan);
            System.out.println(name + " has successfully applied for a loan.");
        } else {
            System.out.println(name + " is not eligible for a loan.");
        }
    }
}
