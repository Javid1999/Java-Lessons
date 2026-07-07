package exceptions;

public class LoanValidator {

    public void validate(LoanApplication application)
          {
        if (application.getCustomer().getAge()<18) {
            throw new InvalidAgeException("Musterinin yashi 18 den asagi ola bilmez");
        }

        if (application.getCustomer().getMonthlyIncome()<350){
            throw new InvalidIncomeException("Musterinin aylig geliri 350 aznden az ola bilmez");
        }

        if (application.getLoanAmount()<500 || application.getLoanAmount()>50000){
            throw new InvalidLoanAmountException("Kredit limiti duzgun teyin olunmayib !!!");
        }
        if (application.getLoanPeriod()<6 || application.getLoanPeriod()>59){
            throw new InvalidLoanPeriodException("Kreditin muddeti duzgun teyin olunmayib");
        }
        if (application.getCustomer().isHasDelayedLoan()) {

            throw new ActiveLoanException("Musterinin aktiv gecikmesi var!!!");
        }
    }
}
