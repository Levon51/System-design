package transaction_interface;

import model.Account;


public interface Transaction{
     void deposit(Account card , int amount);
     void withdraw(Account card, int amount);
     void transfer(Account fromCard, Account toCard,int amount);
}
