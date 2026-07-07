package atmcashwithdrawalsystem;

public class WithdrawalValidator implements Validator {
    @Override
    public void validate(Withdrawal withdrawal) {
        if (withdrawal.getAccount().isBlocked()){
            throw new BlocedAccountException("Account is blocked");
        }
        if (withdrawal.getAmount()<0){
            throw  new InvalidAmountException("Amount is negative");
        }
        if (withdrawal.getAccount().getBalance()<withdrawal.getAmount()){
            throw  new InsufficientBalanceException("Insufficient balance");
        }
        if (withdrawal.getAmount()>1000){
            throw new DailyLimitException("Daily limit exceeded");
        }
    }
}
