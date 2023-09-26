package main.java.com.demo.solid.dependency_inversion.bad;

public class AppleStore {
    private final CreditCard creditCard;
    private final DebitCard debitCard;

    public AppleStore(CreditCard creditCard, DebitCard debitCard) {
        this.creditCard = creditCard;
        this.debitCard = debitCard;
    }

    public void buyIphone(long amount) {
        creditCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        AppleStore store = new AppleStore(creditCard, debitCard);
        store.buyIphone(1500);
    }
}
