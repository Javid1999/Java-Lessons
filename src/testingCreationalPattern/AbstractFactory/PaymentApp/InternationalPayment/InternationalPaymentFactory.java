package testingCreationalPattern.AbstractFactory.PaymentApp.InternationalPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.*;

public class InternationalPaymentFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new InternationalPaymentProcessor();
    }
    @Override
    public PaymentValidator createPaymentValidator() {
        return new InternationalPaymentValidator();
    }
}
