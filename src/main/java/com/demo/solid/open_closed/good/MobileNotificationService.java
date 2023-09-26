package main.java.com.demo.solid.open_closed.good;

public class MobileNotificationService implements NotificationService{
    @Override
    public void sendOTP(String otp) {
        System.out.println("send otp " + otp + " to mobile");
    }

    @Override
    public void sendTransactionInfo(String message) {
        System.out.println("send message " + message + " to mobile");
    }
}
