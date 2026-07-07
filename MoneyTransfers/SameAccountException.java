package MoneyTransfers;

public class SameAccountException extends RuntimeException {
    public SameAccountException(String message) {
        super(message);
    }


}
