import enumes.BankAccountType;
import enumes.CardStatus;
import enumes.CardType;
import enumes.Currency;
import model.*;
import transaction.BankAccountTransaction;
import transaction.CardTransaction;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,9,25);
        LocalDate date1 = LocalDate.of(2024,4,24);

        Address address = new Address("Armenia","Gegharquniq","Sevan","Shinararner 2",18);
        CardAccount cardAccount = new CardAccount(4454300004242563L,900,date, CardType.VISA,40000,Currency.AMD, CardStatus.ACTIVE);
        BankAccount bankAccount = new BankAccount(2984899237311117L,40020.4,Currency.AMD, BankAccountType.CREDIT);
        ArrayList<CardAccount> cardAccount0 = new ArrayList<>();
        cardAccount0.add(cardAccount);
        CardHolder cardHolder = new CardHolder("NG09898338 ",bankAccount,cardAccount0,"Levon Gharibyan" ,address);

        Address address1 = new Address("Armenia", "Aragatsotn", "Ashtarak","Armenyan",44);
        CardAccount cardAccount1 = new CardAccount(4455050004450444L,111,date1,CardType.AMERICAN_EXPRESS,23_049.4,Currency.AMD,CardStatus.ACTIVE);
        BankAccount bankAccount1 = new BankAccount(1244548992110900L,49000.60,Currency.AMD,BankAccountType.CREDIT);
        ArrayList<CardAccount>cardAccounts2 = new ArrayList<>();
        cardAccounts2.add(cardAccount1);
        CardHolder cardHolder1 = new CardHolder("OM6180083",bankAccount1,new ArrayList<CardAccount>(),"Jora Sahakyan", address1);

        CardTransaction transaction = new CardTransaction();
        transaction.deposit(cardAccount1,4000);
        transaction.deposit(cardAccount,6000);

        CardTransaction trans = new CardTransaction();
       // trans.withdraw(cardAccount, 50000);
        trans.withdraw(cardAccount1,25000);

        CardTransaction transfer = new CardTransaction();
        //transfer.transfer(cardAccount1,cardAccount,3000);
        transfer.transfer(cardAccount,cardAccount1,10000);

        CardTransaction block = new CardTransaction();
        block.block(cardAccount);

        BankAccountTransaction bankAccountTransaction = new BankAccountTransaction();
        bankAccountTransaction.deposit(bankAccount, 20000);
        System.out.println(bankAccountTransaction.getBalance(bankAccount));
    }

}
