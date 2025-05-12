package model;

import exception.InsufficientFundsException;

public class BankAccountTransaction {
    public void deposit(BankAccount acc, int amount){
        if(acc == null){
            throw new InsufficientFundsException("Account is not found.");
        }
        acc.setBalance(acc.getBalance() + amount);
    }
    public void withdraw(BankAccount acc, int amount){
        if(acc == null){
            throw new InsufficientFundsException("Account is not found.");
        }if(acc.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money.");
        }
        acc.setBalance(acc.getBalance() - amount);
    }
    public void transfer(BankAccount fromAcc,BankAccount toAcc, int amount){
        if(fromAcc == null || toAcc == null){
            throw new InsufficientFundsException("One or both accounts not found.");
        }if(fromAcc.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money.");
        }
        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance() + amount);
        System.out.println("Transfer successful");
    }
    public double getBalance(BankAccount balance){
        return balance.getBalance();
    }
}
