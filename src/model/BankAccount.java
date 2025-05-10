package model;

import enumes.Currency;

public class BankAccount {
    private long accNumber;
    private double balance;
    private Currency currency;

    public BankAccount(long accNumber, double balance, Currency currency) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
