package model;

import enumes.CardStatus;
import enumes.CardType;
import enumes.Currency;

import java.time.LocalDate;

public class CardAccount {
    private long cardNumber;
   private int cvv;
   private LocalDate expirationDate;
   private CardType cardType;
   private int balance;
   private Currency currency;
   private CardStatus cardStatus;

    public CardAccount(long cardNumber, int cvv, LocalDate expirationDate, CardType cardType, int balance,
                       Currency currency, CardStatus cardStatus) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.balance = balance;
        this.currency = currency;
        this.cardStatus = cardStatus;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
