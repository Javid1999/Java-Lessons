package testingCreationalPattern.AbstractFactory.PaymentApp.InternationalPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentProcessor;

public class InternationalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("International Payment Processor");
    }
}
