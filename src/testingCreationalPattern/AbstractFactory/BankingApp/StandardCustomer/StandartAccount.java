package testingCreationalPattern.AbstractFactory.BankingApp.StandardCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.Account;

public class StandartAccount implements Account {
    @Override
    public void getAccountInfo() {
        System.out.println("Standart Account");
    }
}
