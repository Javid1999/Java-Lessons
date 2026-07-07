package exceptions;

public class InvalidLoanPeriodException extends RuntimeException {
    public InvalidLoanPeriodException(String message) {
        super(message);
    }
}
