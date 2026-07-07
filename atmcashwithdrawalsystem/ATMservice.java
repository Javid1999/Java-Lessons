package atmcashwithdrawalsystem;

public class ATMservice {
    private Validator validator = new WithdrawalValidator();

    public void withdraw(Withdrawal withdrawal) {
        validator.validate(withdrawal);
        Account account = withdrawal.getAccount();

        double newBalance = account.getBalance()-withdrawal.getAmount();
        account.setBalance(newBalance);
        System.out.println("Withdrawal account balance is " + account.getBalance());
    }
}
