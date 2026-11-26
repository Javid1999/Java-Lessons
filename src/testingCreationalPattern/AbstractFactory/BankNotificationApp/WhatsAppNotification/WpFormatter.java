package testingCreationalPattern.AbstractFactory.BankNotificationApp.WhatsAppNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;

public class WpFormatter implements NotificationFormatter {
    @Override
    public void createFormatter() {
        System.out.println("Created WP Formatter");
    }
}
