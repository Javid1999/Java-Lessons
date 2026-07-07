package mobilNotificationSystem;

public class PushNotification extends Notification{
    public PushNotification(int id, String title, String message, NotificationType type) {
        super(id, title, message, type);
    }
    @Override
    public void send(){
        System.out.println("Push gonderildi");

    }
}
