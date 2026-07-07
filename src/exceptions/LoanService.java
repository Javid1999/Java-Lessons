package exceptions;

public class LoanService {
    LoanValidator validator = new LoanValidator();
    public void LoanAplication (LoanApplication application) {
        validator.validate(application);

        System.out.println("Kredit ugurla verildi");
    }
}
