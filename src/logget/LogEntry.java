package logget;

public class LogEntry <T>{
    private final T data;
    public LogEntry(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
