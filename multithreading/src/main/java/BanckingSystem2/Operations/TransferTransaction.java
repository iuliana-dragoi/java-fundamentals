package main.java.BanckingSystem2.Operations;

import main.java.BanckingSystem2.Bank.Account;

import java.math.BigDecimal;

public class TransferTransaction implements Transaction {

    private final Account from;

    private final Account to;

    private final BigDecimal amount;

    public TransferTransaction(Account from, Account to, BigDecimal amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void process() {
        Account first = from.getId() < to.getId() ? from : to;
        Account second = from.getId() < to.getId() ? to : from;

        first.lock();
        second.lock();
        try {
            if (from.getBalance().compareTo(amount) >= 0) {
                from.setBalance(from.getBalance().subtract(amount));
                to.setBalance(to.getBalance().add(amount));
                if(debug) System.out.println("Transferred " + amount.toPlainString() + " from Account " + from.getId() + " to Account " + to.getId());
            } else {
                if(debug) System.out.println("Insufficient funds for transfer from Account " + from.getId());
            }
        } finally {
            second.unlock();
            first.unlock();
        }
    }
}
