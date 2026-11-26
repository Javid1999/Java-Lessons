package testingCreationalPattern.AbstractFactory.PaymentApp.CardPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.*;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CardPaymentProcessor();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new CardPaymentValidator();
    }
}
