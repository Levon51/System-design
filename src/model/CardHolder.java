package model;

import java.util.ArrayList;
import java.util.Arrays;

public class CardHolder {
    private String passportNumber;
    private BankAccount bankAccount;
    private ArrayList<CardAccount> cardAccounts;
    private String fullName;
    private Address address;

    public CardHolder(String passportNumber, BankAccount bankAccount, ArrayList<CardAccount> cardAccounts,
                      String fullName, Address address) {
        this.passportNumber = passportNumber;
        this.bankAccount = bankAccount;
        this.cardAccounts = cardAccounts;
        this.fullName = fullName;
        this.address = address;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public ArrayList<CardAccount> getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(ArrayList<CardAccount> cardAccounts) {
        this.cardAccounts = cardAccounts;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString(){
        return "{Passport number = " + passportNumber + bankAccount +
                ", Card accounts = " + cardAccounts + ", First name and last name: " +
                fullName + address;
    }
}
