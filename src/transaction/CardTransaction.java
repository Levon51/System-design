package transaction;

import enumes.CardStatus;
import exception.InsufficientFundsException;
import model.Account;
import model.CardAccount;
import transaction_interface.Transaction;

public class CardTransaction implements Transaction {
    public void deposit(Account card, int amount){
        CardAccount ca = (CardAccount) card;
        if(ca.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }else if(amount < 0){
            throw new InsufficientFundsException("");
        }
        ca.setBalance(ca.getBalance() + amount);
    }
    public void withdraw(Account card, int amount){
        CardAccount ca = (CardAccount) card;
        if(ca.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }if (ca.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money.");
        }else{
            ca.setBalance(card.getBalance() - amount);
        }
    }
    public void transfer(Account fromCard, Account toCard, int amount){
        CardAccount ca = (CardAccount)fromCard;
        CardAccount ca1 = (CardAccount) toCard;
        if (ca == null || ca1 == null) {
            throw new InsufficientFundsException("One or both cards not found.");
        }
        if (ca1.getCardStatus() == CardStatus.BLOCKED || ca.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }if (ca.getBalance() < amount) {
            throw new InsufficientFundsException("Not enough money.");
        }
        ca.setBalance(ca.getBalance() - amount);
        ca1.setBalance(ca1.getBalance() + amount);
        System.out.println("Transfer successful");
    }
    public void block(CardAccount card){
        if(card.getCardStatus() == CardStatus.ACTIVE){
            card.setCardStatus(CardStatus.BLOCKED);
            System.out.println("Card is now blocked.");
        }
    }
    public double getBalance(CardAccount card){
        return card.getBalance();
    }
}
