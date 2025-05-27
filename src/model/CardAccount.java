package model;

import enumes.CardStatus;
import enumes.CardType;
import enumes.Currency;

import java.time.LocalDate;

public class CardAccount extends Account {
   private int cvv;
   private LocalDate expirationDate;
   private CardType cardType;
   private CardStatus cardStatus;

    public CardAccount(long accNumber, int cvv, LocalDate expirationDate, CardType cardType, double balance,
                       Currency currency, CardStatus cardStatus) {
        super(accNumber,currency,balance);
        this.accNumber = accNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.balance = balance;
        this.currency = currency;
        this.cardStatus = cardStatus;
    }

    public long getCardNumber() {
        if(accNumber < 1000000000000000L || accNumber > 9999999999999999L){
            System.out.println("The number must contain sixteen numbers");
        }
        return accNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.accNumber = cardNumber;
    }

    public int getCvv() {

         if(cvv < 100 || cvv > 999){
             System.out.println("The number must be three numbers");
        }
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

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String toString(){
        return "Card account{" + "Card number = " + accNumber + ", CVV = " + cvv + ", Date: "
                + expirationDate + ", Card type: " + cardType + ", Balance = " + balance +
                ", The currency of card: " + currency + ", Card status: " + cardStatus + "}";
    }
}
