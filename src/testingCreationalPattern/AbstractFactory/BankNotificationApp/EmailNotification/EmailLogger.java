package testingCreationalPattern.AbstractFactory.BankNotificationApp.EmailNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;

public class EmailLogger implements NotificationLogger {
    @Override
    public void notifyLogger(String message) {
        System.out.println("Email LOGGER"+message);
    }
}
