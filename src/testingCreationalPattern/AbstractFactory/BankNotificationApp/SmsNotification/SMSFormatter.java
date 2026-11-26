package testingCreationalPattern.AbstractFactory.BankNotificationApp.SmsNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;

public class SMSFormatter implements NotificationFormatter {
    @Override
    public void createFormatter() {
        System.out.println("DEAR FAMILY");
    }
}
