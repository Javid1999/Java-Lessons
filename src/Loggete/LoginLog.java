package Loggete;

public class LoginLog implements Log{
    private Integer userId;
    private String status;

    public LoginLog(Integer userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    @Override
    public String format() {
        return "USER_LOGIN | userId=" + userId + " | " + status;
    }
}
