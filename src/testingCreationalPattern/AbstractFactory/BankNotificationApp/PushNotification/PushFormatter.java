package testingCreationalPattern.AbstractFactory.BankNotificationApp.PushNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;

public class PushFormatter implements NotificationFormatter {
    @Override
    public void createFormatter() {
        System.out.println("Push Formatter created");
    }
}
