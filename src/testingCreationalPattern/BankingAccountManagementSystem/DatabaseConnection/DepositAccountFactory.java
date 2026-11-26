package testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection;

public class DepositAccountFactory implements BankingAccountFactory{
    @Override
    public Account createAccount() {
        return new DepositAccount();
    }
}
