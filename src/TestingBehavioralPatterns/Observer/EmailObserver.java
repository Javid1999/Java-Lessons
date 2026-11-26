package TestingBehavioralPatterns.Observer;

public class EmailObserver implements NotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("Email Observer: " + message);
    }
}
