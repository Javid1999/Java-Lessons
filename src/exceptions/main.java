package exceptions;

public class main {
    public static void main (String[] args) {
        Customers customer = new Customers(1, "Cavid Qarayev", 26, 2000, false);
        LoanApplication application = new LoanApplication(450, 6, customer);
        LoanService loanService = new LoanService();
        loanService.validator.validate(application);
    }
}
