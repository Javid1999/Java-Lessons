package bankaccountcustomer;

public class SavingAccount extends Account{
    public SavingAccount(int id,double balance) {
        super(id,balance);
    }
    public double calculateInterest() {
        return  getBalance()*0.1;
    }
}
