package main.java.BankSystemExample3.Loan;

public interface LoanEligible {

    boolean isEligible();

    void applyForLoan(LoanApplication application);
}
