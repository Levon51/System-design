package model;

import enumes.Currency;

public class Account {
    long accNumber;
    Currency currency;
    double balance;

    public Account(long accNumber, Currency currency, double balance) {
        this.accNumber = accNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
