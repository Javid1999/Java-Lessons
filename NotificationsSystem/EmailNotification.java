package NotificationsSystem;

public class EmailNotification extends Notification{

    public EmailNotification(){
    }
    public EmailNotification(String  title,String message){
        super(title,message);
    }
    @Override
    public void sendNotification(){
        System.out.println("Email gonderildi:" +getTitle());
    }

}
