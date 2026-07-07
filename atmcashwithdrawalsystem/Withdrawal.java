package atmcashwithdrawalsystem;

public class Withdrawal {
    private Account account;
    private double amount;
  private Currency currency;
    public Withdrawal(Account account, double amount , Currency currency) {
        this.account = account;
        this.amount = amount;
        this.currency = currency;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
