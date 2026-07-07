package mobilNotificationSystem;

 public class EmailNotification extends Notification {

    public EmailNotification(int id, String title, String message, NotificationType type) {
        super(id, title, message, type);
    }
    @Override
 public void send(){
        System.out.println("Email gonderildi");

    }

}
