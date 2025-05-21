package transaction_interface;

import model.BankAccount;

public interface BankTransaction {
    void deposit(BankAccount acc, int amount);
    void withdraw(BankAccount acc, int amount);
    void transfer(BankAccount fromAcc,BankAccount toAcc, int amount);
}
