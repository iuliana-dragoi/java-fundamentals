package main.java.BanckingSystem2.Operations;

import main.java.BanckingSystem2.Bank.Account;

import java.math.BigDecimal;

public class DepositTransaction implements Transaction {

    private final Account account;

    private final BigDecimal amount;

    public DepositTransaction(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.lock();
        try {
            BigDecimal currentBalance = account.getBalance();
            BigDecimal result = currentBalance.add(amount);
            account.setBalance(result);
            if(debug) System.out.println("Amount deposited: " + amount.toPlainString() + " in account: " + account.getId() + ". Current balance: " + account.getBalance().toPlainString());
        }
        finally {
            account.unlock();
        }
    }
}
