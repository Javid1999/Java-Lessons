package taskkk;

public class RetailLoan extends Loan{
    public RetailLoan(int id, double amount) {
        super(id, amount);
    }

    @Override
        public double loancommission(){
        return getAmount()*0.05;
    }
}
