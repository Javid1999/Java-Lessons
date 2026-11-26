package testingCreationalPattern.AbstractFactory.BankNotificationApp;


public interface NotifiactionFactory  {
    NotificationSender createNotification();
    NotificationLogger createNotificationLogger();
    NotificationFormatter createNotificationFormatter();
}
