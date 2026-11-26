package testingCreationalPattern.AbstractFactory.BankingApp.PremiumCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.Account;

public class PremiumAccount implements Account {
    @Override
    public void getAccountInfo() {
        System.out.println("Premium Account");
    }
}
