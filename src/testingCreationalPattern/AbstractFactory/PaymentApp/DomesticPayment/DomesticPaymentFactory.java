package testingCreationalPattern.AbstractFactory.PaymentApp.DomesticPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.*;

public class DomesticPaymentFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new DomesticPaymentProcessor();
    }
    @Override
    public PaymentValidator createPaymentValidator() {
        return new DomesticPaymentValidator();
    }
}
