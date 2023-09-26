package main.java.com.demo.solid.dependency_inversion.bad;

public class CreditCard {
    public void doTransaction(long amount) {
        System.out.println("Pay by credit card: " + amount);
    }
}