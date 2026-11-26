package logget;

public class TransferLog extends LogEntry<Integer> implements Log{
    private final String message;
    public TransferLog(Integer amount ,String message) {
        super(amount);
        this.message = message;
    }
    @Override
    public String format() {
        return "TRANSFER" + " | amount=" + getData() + " | txId=" + message;
    }
}
