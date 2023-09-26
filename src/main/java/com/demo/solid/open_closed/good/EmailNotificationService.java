package main.java.com.demo.solid.open_closed.good;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String otp) {
        System.out.println("send otp " + otp + " to email");
    }

    @Override
    public void sendTransactionInfo(String message) {
        System.out.println("send message " + message + " to email");
    }
}
