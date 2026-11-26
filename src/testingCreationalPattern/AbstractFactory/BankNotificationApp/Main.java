package testingCreationalPattern.AbstractFactory.BankNotificationApp;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.PushNotification.PUSHNotificationFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.SmsNotification.SMSNotificationFactory;
import testingCreationalPattern.AbstractFactory.BankNotificationApp.WhatsAppNotification.WpNotificationFactory;

public class Main {

    public static void main(String[] args) {
        NotifiactionFactory notifiactionFactory = new WpNotificationFactory();
        NotificationSender notificationSender = notifiactionFactory.createNotification();
        NotificationLogger notificationLogger = notifiactionFactory.createNotificationLogger();
        NotificationFormatter notificationFormatter = notifiactionFactory.createNotificationFormatter();

notificationSender.sendNotification("ADAF");
notificationLogger.notifyLogger("test");
notificationFormatter.createFormatter();


    }
}
