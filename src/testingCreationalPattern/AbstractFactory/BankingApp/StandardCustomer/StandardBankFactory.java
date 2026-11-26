package testingCreationalPattern.AbstractFactory.BankingApp.StandardCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.*;

public class StandardBankFactory implements BankFactory {

    public Account createAccount() {
        return new StandartAccount();
    }
    public Card createCard() {
        return new StandardCard();
    }

}
