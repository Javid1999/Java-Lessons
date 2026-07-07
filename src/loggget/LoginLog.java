package loggget;

public class LoginLog implements Log {


    private int userid;
  private String status;

    public LoginLog(int userid,String status) {
        this.userid = userid;
        this.status = status;
    }
    @Override
    public String format() {
        return "USER_LOGIN | userid=" + userid + "|status=" + status;
    }
}
