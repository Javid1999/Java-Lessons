package logget;

public final class LoginLog extends LogEntry<Integer> implements Log {
 private final String status;

    public LoginLog(Integer userId, String status) {
        super(userId);
        this.status = status;

    }

    @Override
    public String format() {
        return "USER_LOGIN" + " | userId=" + getData() + " | status=" + status;
    }
}
