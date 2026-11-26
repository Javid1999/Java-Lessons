package testingCreationalPattern.AbstractFactory.BankNotificationApp.SmsNotification;

import testingCreationalPattern.AbstractFactory.BankNotificationApp.NotificationLogger;

public class SMSLogger implements NotificationLogger {
    @Override
    public void notifyLogger(String message) {
        System.out.println("SMS LOGGER: "+ message);
    }
}
