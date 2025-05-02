package main.java.BanckingSystem2.Operations;

import main.java.BanckingSystem2.Bank.Account;
import java.math.BigDecimal;

public class WithdrawTransaction implements Transaction {

    private final Account account;

    private final BigDecimal amount;

    public WithdrawTransaction(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.lock();
        try {
            BigDecimal currentBalance = account.getBalance();
            if(currentBalance.compareTo(amount) >= 0) {
                // a.compareTo(b);
                // a.compareTo(b) == 0 → values are equal (ignores scale)
                // a.compareTo(b) > 0 → a is greater than b
                // a.compareTo(b) < 0 → a is less than b
                BigDecimal result = currentBalance.subtract(amount);
                account.setBalance(result);
                if(debug) System.out.println("Amount withdrawn: " + amount.toPlainString() + " from account: " + account.getId() + ". Current balance: " + account.getBalance().toPlainString());
            }
            else {
                if(debug) System.out.println("Insufficient funds!");
            }
        }
        finally {
            account.unlock();
        }
    }
}
