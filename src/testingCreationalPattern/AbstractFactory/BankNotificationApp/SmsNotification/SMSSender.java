package testingCreationalPattern.AbstractFactory.BankNotificationApp.SmsNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class SMSSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS SENDER:"+ message);
    }
}
