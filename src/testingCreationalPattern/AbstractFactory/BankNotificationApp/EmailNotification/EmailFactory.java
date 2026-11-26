package testingCreationalPattern.AbstractFactory.BankNotificationApp.EmailNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotifiactionFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class EmailFactory implements NotifiactionFactory {
    @Override
    public NotificationSender createNotification() {
        return new EmailSender();
    }

    @Override
    public NotificationLogger createNotificationLogger() {
        return new EmailLogger();
    }

    @Override
    public NotificationFormatter createNotificationFormatter() {
        return new EmailFormatter();
    }
}
