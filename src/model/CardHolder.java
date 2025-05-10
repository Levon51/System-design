package model;

public class CardHolder {
    private String passportNumber;
    private BankAccount bankAccount;
    private CardAccount[] cardAccounts;
    private String fullName;
    private Address address;

    public CardHolder(String passportNumber, BankAccount bankAccount, CardAccount[] cardAccounts,
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

    public CardAccount[] getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(CardAccount[] cardAccounts) {
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
}
