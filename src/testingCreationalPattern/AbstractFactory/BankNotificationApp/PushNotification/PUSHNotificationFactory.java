package testingCreationalPattern.AbstractFactory.BankNotificationApp.PushNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotifiactionFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class PUSHNotificationFactory implements NotifiactionFactory {
    @Override
    public NotificationSender createNotification() {
        return new PUSHSender();
    }

    @Override
    public NotificationLogger createNotificationLogger() {
        return new  PUSHLogger();
    }

    @Override
    public NotificationFormatter createNotificationFormatter() {
        return new PushFormatter();
    }
}
