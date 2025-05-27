package transaction;

import bank.Bank;
import exception.BankTransactionException;
import exception.InsufficientFundsException;
import model.Account;
import model.BankAccount;
import transaction_interface.Transaction;

public class BankAccountTransaction implements Transaction {
    public void deposit(Account acc, int amount){
        if(acc == null){
            throw new BankTransactionException("Account is not found.");
        }else if(amount < 0){
            throw new BankTransactionException("Money cannot be negative");
        }
        BankAccount ba = (BankAccount) acc;
        System.out.println(ba);
        acc.setBalance(acc.getBalance() + amount);
    }

    public void withdraw(Account acc, int amount){
        if(acc == null){
            throw new BankTransactionException("Account is not found.");
        }if(acc.getBalance() < amount){
            throw new BankTransactionException("Not enough money.");
        }
        BankAccount ba = (BankAccount) acc;
        System.out.println(ba);
        acc.setBalance(acc.getBalance() - amount);
    }
    public void transfer(Account fromAcc,Account toAcc, int amount){
        if(fromAcc == null || toAcc == null){
            throw new BankTransactionException("One or both accounts not found.");
        }if(fromAcc.getBalance() < amount){
            throw new BankTransactionException("Not enough money.");
        }
        BankAccount ba = (BankAccount) fromAcc;
        BankAccount ba1 = (BankAccount) toAcc;
        System.out.println(ba);
        System.out.println(ba1);
        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance() + amount);
        System.out.println("Transfer successful");
    }
    public double getBalance(BankAccount balance){
        return balance.getBalance();
    }

}
