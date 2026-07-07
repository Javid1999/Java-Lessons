package NotificationsSystem;

public class smsNotification extends Notification {
    public smsNotification() {
    }

    public smsNotification(String title, String message) {
        super(title, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sms gonderildi:"+getMessage());

    }
}
