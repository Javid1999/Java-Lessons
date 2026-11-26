package TestingBehavioralPatterns.Observer;

import java.util.Observer;

public class SMSObserver implements NotificationObserver{
    @Override
    public void update(String message) {
        System.out.println("SMS Observer: " + message);
    }
}
