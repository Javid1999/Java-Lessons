package mobilNotificationSystem;

public class Main {
    public static void main(String[] args) {
        Notification sms = new SmsNotification(1,"OTP","Kod: 1234",NotificationType.SMS);
        Notification push = new PushNotification(2,"PUSH","ODENIS GUNU",NotificationType.PUSH);
        Notification mail = new EmailNotification(3,"MAIL","ERROR",NotificationType.EMAIL);


      sms.send();
      push.send();
        mail.send();
    }
}
