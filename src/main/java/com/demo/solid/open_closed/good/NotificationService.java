package main.java.com.demo.solid.open_closed.good;

public interface NotificationService {
    public void sendOTP (String otp);
    public void sendTransactionInfo (String message);
}
