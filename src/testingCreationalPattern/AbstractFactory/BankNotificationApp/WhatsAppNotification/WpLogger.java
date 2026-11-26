package testingCreationalPattern.AbstractFactory.BankNotificationApp.WhatsAppNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;

public class WpLogger implements NotificationLogger {
    @Override
    public void notifyLogger(String message) {
        System.out.println("Notified WP logger: " + message);
    }
}
