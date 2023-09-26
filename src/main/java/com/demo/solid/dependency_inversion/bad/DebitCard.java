package main.java.com.demo.solid.dependency_inversion.bad;

public class DebitCard {
    public void doTransaction(long amount) {
        System.out.println("Pay with debit card: " + amount);
    }
}
