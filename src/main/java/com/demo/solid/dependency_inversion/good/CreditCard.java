package main.java.com.demo.solid.dependency_inversion.good;

public class CreditCard implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("Pay by credit card: " + amount);
    }
}
