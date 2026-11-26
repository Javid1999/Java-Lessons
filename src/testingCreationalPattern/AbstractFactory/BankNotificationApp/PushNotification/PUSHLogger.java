package testingCreationalPattern.AbstractFactory.BankNotificationApp.PushNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;

public class PUSHLogger implements NotificationLogger {
    @Override
    public void notifyLogger(String message) {
        System.out.println("PUSH LOGGER");
    }
}
