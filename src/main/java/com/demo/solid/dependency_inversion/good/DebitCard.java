package main.java.com.demo.solid.dependency_inversion.good;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Pay with debit card: " + amount);
    }
}
