package testingCreationalPattern.AbstractFactory.BankingApp.StandardCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.Card;

public class StandardCard implements Card {
    @Override
    public void getCardInfo() {
        System.out.println("Standard Card");
    }
}
