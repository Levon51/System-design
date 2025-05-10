import enumes.CardStatus;
import enumes.CardType;
import enumes.Currency;
import model.Address;
import model.BankAccount;
import model.CardAccount;
import model.CardHolder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,9,25);
        LocalDate date1 = LocalDate.of(2024,4,24);
        Address address = new Address("Armenia","Gegharquniq","Sevan","Shinararner 2",18);
        CardAccount cardAccount = new CardAccount(4454300004242563L,900,date, CardType.VISA,5000,Currency.AMD, CardStatus.ACTIVE);
        CardAccount cardAccount1 = new CardAccount(4455050004450444L,111,date1,CardType.AMERICAN_EXPRESS,1000,Currency.USD,CardStatus.BLOCKED);
        BankAccount bankAccount = new BankAccount(2984899237311117L,2000,Currency.RUB);
        CardHolder cardHolder = new CardHolder("NG09898338",bankAccount,new CardAccount[]{cardAccount1,cardAccount},"Levon Gharibyan",address);
        System.out.println(cardHolder);


    }
}
