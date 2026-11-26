package testingCreationalPattern.AbstractFactory.BankNotificationApp.WhatsAppNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class WpSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending WhatsApp Message: " + message);
    }
}
