package NotificationsSystem;

import PaymentCommission.Payment;

import java.util.Objects;

public class Notification {
    private String title;
    private String message;

    public Notification(){
    }
    public Notification(String title,String message){
        this.title = title;
        this.message = message;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    void sendNotification(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null ||  getClass() != o.getClass()) {
            return  false;
        }
        Notification notification = (Notification) o;

        return Objects.equals(title, notification.title)
                && Objects.equals(message, notification.message);
    }
    public int hashCode() {
        return Objects.hash(title, message);
    }
    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


