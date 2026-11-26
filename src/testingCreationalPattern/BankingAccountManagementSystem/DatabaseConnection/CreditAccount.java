package testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection;

public class CreditAccount implements Account {
    @Override
    public void createAccount() {
        System.out.println("Credit Account Created");
    }
}
