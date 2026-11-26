package testingCreationalPattern.AbstractFactory.BankingApp;

public interface BankFactory {

    Account createAccount();
    Card createCard();
}
