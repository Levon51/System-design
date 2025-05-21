package transaction_interface;

import model.CardAccount;

public interface CardAccountTransaction {
     void deposit(CardAccount card, int amount);
     void withdraw(CardAccount card, int amount);
     void transfer(CardAccount fromCard,CardAccount toCard,int amount);
     void block(CardAccount card);
}
