package testingCreationalPattern.AbstractFactory.BankNotificationApp.WhatsAppNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotifiactionFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationFormatter;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationSender;

public class WpNotificationFactory implements NotifiactionFactory {
    @Override
    public NotificationSender createNotification() {
        return new WpSender();
    }

    @Override
    public NotificationLogger createNotificationLogger() {
        return new WpLogger();
    }

    @Override
    public NotificationFormatter createNotificationFormatter() {
        return new WpFormatter();
    }
}
