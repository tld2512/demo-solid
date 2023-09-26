package main.java.com.demo.solid.single_responsibility.bad;

public class BankService {

    public long deposit(long amount, String accountNumber) {
        return 0;
    }

    public long withdraw(long amount, String accountNumber) {
        return 0;
    }

    public void transferCash(long amount, String accountNumber) {
        System.out.println("transfer " + " " + amount + " to " + accountNumber);
    }
}