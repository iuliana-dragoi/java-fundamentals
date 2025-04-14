package main.java.BankSystemExample3.Loan;

public class LoanApplication {

    private double loanAmount;
    private double interestRate;
    private int repaymentPeriodMonths;

    public LoanApplication(double loanAmount, double interestRate, int repaymentPeriodMonths) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.repaymentPeriodMonths = repaymentPeriodMonths;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getRepaymentPeriodMonths() {
        return repaymentPeriodMonths;
    }
}
