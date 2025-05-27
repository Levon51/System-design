package model;

import enumes.BankAccountType;
import enumes.Currency;

public class BankAccount extends Account{
    private BankAccountType bankAccountType;

    public BankAccount(long accNumber, double balance, Currency currency, BankAccountType bankAccountType) {
        super(accNumber,currency,balance);
                this.bankAccountType = bankAccountType;
    }

    public long getAccNumber() {
        if(accNumber <1000000000000000L || accNumber > 9999999999999999L){
            System.out.println("The number must contain sixteen numbers");
        }
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

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accNumber +
                ", balance=" + balance +
                ", currency=" + currency + ",bank account type=" + bankAccountType +
                '}';
    }
}
