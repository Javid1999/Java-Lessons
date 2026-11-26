package testingCreationalPattern.AbstractFactory.BankNotificationApp.EmailNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;

public class EmailFormatter implements NotificationFormatter {
    @Override
    public void createFormatter() {
        System.out.println("EmailFormatter createFormatter");
    }
}
