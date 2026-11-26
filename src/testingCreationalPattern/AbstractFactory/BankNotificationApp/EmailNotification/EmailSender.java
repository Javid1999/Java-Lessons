package testingCreationalPattern.AbstractFactory.BankNotificationApp.EmailNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email SENDER"+message);
    }
}
