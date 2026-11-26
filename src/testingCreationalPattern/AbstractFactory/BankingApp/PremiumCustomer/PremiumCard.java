package testingCreationalPattern.AbstractFactory.BankingApp.PremiumCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.Card;

public class PremiumCard implements Card {
    @Override
    public void getCardInfo() {
        System.out.println("Premium Card");
    }
}
