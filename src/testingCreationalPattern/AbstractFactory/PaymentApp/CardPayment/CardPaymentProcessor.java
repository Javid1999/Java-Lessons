package testingCreationalPattern.AbstractFactory.PaymentApp.CardPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentProcessor;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing Card Payment");
    }
}
