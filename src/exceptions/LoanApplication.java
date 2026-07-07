package exceptions;

public class LoanApplication  {
    private  double loanAmount;
    private  int loanPeriod;
    private  Customers customer;

    public LoanApplication(double loanAmount, int loanPeriod, Customers customer) {
        this.loanAmount = loanAmount;
        this.loanPeriod = loanPeriod;
        this.customer = customer;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}
