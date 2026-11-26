package testingCreationalPattern.AbstractFactory.BankingApp.PremiumCustomer;

import testingCreationalPattern.AbstractFactory.BankingApp.Account;
import testingCreationalPattern.AbstractFactory.BankingApp.BankFactory;
import testingCreationalPattern.AbstractFactory.BankingApp.Card;

public class PremiumBankFactory implements BankFactory {

    public Account createAccount() {
        return new PremiumAccount();
    }
    public Card createCard() {
        return new PremiumCard();
    }

}
