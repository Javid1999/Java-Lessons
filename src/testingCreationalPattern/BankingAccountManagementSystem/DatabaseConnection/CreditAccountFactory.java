package testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection;

public class CreditAccountFactory implements BankingAccountFactory{
    @Override
    public Account createAccount() {
        return new CreditAccount();
    }
}
