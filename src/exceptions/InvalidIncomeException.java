package exceptions;

public class InvalidIncomeException extends RuntimeException {
    public InvalidIncomeException(String message) {
        super(message);
    }
}
