package mobilNotificationSystem;

abstract class Notification implements  Sendable{
    private int id;
    private String title;
    private String message;
    private NotificationType type;

    public Notification(int id, String title, String message, NotificationType type) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }
    abstract public void send();
}
