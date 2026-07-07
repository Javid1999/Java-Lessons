package NotificationsSystem;

public class Main {
    public static void main(String[] args){
    Notification notification1 =
            new EmailNotification("Xeberdarliq", "odenis gunu!!!!!");

    Notification notification2 =
            new smsNotification("SMS başlığı", "123456");

    notification1.sendNotification();
    notification2.sendNotification();
}
}
