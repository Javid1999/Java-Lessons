package testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection;

public class SalaryAccountFactory implements BankingAccountFactory{
    @Override
    public Account createAccount() {
        return new SalaryAccount();
    }
}
