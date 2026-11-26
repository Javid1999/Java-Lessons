package testingCreationalPattern.AbstractFactory.BankNotificationApp.SmsNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotifiactionFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class SMSNotificationFactory implements NotifiactionFactory {
    @Override
    public NotificationSender createNotification() {
        return new SMSSender();
    }

    @Override
    public NotificationLogger createNotificationLogger() {
        return new SMSLogger();
    }

    @Override
    public NotificationFormatter createNotificationFormatter() {
        return new SMSFormatter();
    }
}
