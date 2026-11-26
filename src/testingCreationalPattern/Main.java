package testingCreationalPattern;

import testingCreationalPattern.BankingAccountManagementSystem.DatabaseConnection.*;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
            BankingAccountFactory bankingAccountFactory = bankingAccountChecking(AccountChecking.DEPOSIT);
            Account account = bankingAccountFactory.createAccount();
            account.createAccount();
    }

    private  static BankingAccountFactory bankingAccountChecking(AccountChecking text){
        return switch (text){
            case SALARY_ACCOUNT -> new SalaryAccountFactory();
            case CREDIT -> new CreditAccountFactory();
            case DEPOSIT  -> new DepositAccountFactory();
//            default -> throw new IllegalStateException("Unexpected value: " + text);
        };

    }
}
