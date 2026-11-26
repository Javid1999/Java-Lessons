package logget;

public class RiskLog extends LogEntry<Integer> implements Log{
    private final String message;
    public RiskLog(Integer score ,String message) {
        super(score);
        this.message= message;
    }

    @Override
    public String format() {
        return "RISK_CHECK" + " | score=" + getData() + " | status=" + message;
    }
}
