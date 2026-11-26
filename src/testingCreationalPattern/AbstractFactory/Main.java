package testingCreationalPattern.AbstractFactory;


import testingCreationalPattern.AbstractFactory.PaymentApp.*;
import testingCreationalPattern.AbstractFactory.PaymentApp.CardPayment.CardPaymentFactory;

public class Main {
    public static void main(String[] args) {
//        BankFactory factory = new PremiumBankFactory();
//        Account account = factory.createAccount();
//        Card card = factory.createCard();
//
//        account.getAccountInfo();
//        card.getCardInfo();

        PaymentFactory paymentFactory = new CardPaymentFactory();
        PaymentProcessor paymentProcessor = paymentFactory.createPaymentProcessor();
        PaymentValidator paymentValidator = paymentFactory.createPaymentValidator();

        paymentProcessor.processPayment();
        paymentValidator.validatePayment();
    }
}
