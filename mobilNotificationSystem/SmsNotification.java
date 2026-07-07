package mobilNotificationSystem;

public  class SmsNotification extends Notification {
    public SmsNotification(int id, String title, String message, NotificationType type) {
        super(id, title, message, type);
    }
    @Override
    public void send(){
        System.out.println("SMS gonderildi");

    };

}
