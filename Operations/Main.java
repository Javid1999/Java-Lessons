package Operations;

public class Main {
    public static void main(String[] args) {
        OperationProcessor operationProcessor = new OperationProcessor();
        Operation  balanceCheck  = new BalanceCheck();
        Operation  loanPayment = new LoanPayment();
        Operation  profileUpdate = new ProfileUpdate();
        Operation  transfer = new Transfer();

        operationProcessor.process(loanPayment);
        transfer.execute();
    }
}
