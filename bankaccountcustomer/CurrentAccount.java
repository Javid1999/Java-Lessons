package bankaccountcustomer;

public class CurrentAccount extends Account{
    public CurrentAccount(int id, double balance) {
        super(id, balance);
    }
    public double calculateCommisson(){
        return  getBalance()*0.01;
    }
}
