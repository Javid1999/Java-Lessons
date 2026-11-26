package TestingBehavioralPatterns.Observer;



public class MobileObserver implements NotificationObserver  {
    @Override
    public void update(String message) {
        System.out.println("Mobile Observer: " + message);
    }

}
