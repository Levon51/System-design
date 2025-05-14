package transaction;

import enumes.CardStatus;
import exception.InsufficientFundsException;
import model.CardAccount;

public class CardTransaction {
    public void deposit(CardAccount card, int amount){
        if(card.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }else if(amount < 0){
            throw new InsufficientFundsException("")
        }
        card.setBalance(card.getBalance() + amount);
    }
    public void withdraw(CardAccount card, int amount){
        if(card.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }if (card.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money.");
        }else{
            card.setBalance(card.getBalance() - amount);
        }
    }
    public void transfer(CardAccount fromCard, CardAccount toCard, int amount){
        if (fromCard == null || toCard == null) {
            throw new InsufficientFundsException("One or both cards not found.");
        }
        if (toCard.getCardStatus() == CardStatus.BLOCKED || fromCard.getCardStatus() == CardStatus.BLOCKED){
            throw new InsufficientFundsException("Card is blocked.");
        }if (fromCard.getBalance() < amount) {
            throw new InsufficientFundsException("Not enough money.");
        }
        fromCard.setBalance(fromCard.getBalance() - amount);
        toCard.setBalance(toCard.getBalance() + amount);
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
