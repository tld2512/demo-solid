package main.java.com.demo.solid.dependency_inversion.good;

public class AppleStore {
    private final BankCard bankCard;

    public AppleStore(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void buyIphone(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard creditCard = new CreditCard();
        AppleStore store = new AppleStore(creditCard);
        store.buyIphone(1500);
    }
}
