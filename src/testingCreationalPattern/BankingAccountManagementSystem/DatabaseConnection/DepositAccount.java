package testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection;

public class DepositAccount implements Account {
    @Override
    public void createAccount() {
        System.out.println("Deposit Account");
    }
}
