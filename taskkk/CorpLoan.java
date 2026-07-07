package taskkk;

public class CorpLoan extends Loan{
    public CorpLoan(int id, double amount) {
        super(id, amount);
    }
    @Override
    public double loancommission(){
        return getAmount() *0.012;
    }
}
