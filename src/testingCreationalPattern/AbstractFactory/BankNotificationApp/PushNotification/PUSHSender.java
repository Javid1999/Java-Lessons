package testingCreationalPattern.AbstractFactory.BankNotificationApp.PushNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class PUSHSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("PUSH SENDER");
    }
}
