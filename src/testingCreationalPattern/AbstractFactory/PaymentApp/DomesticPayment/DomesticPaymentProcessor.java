package testingCreationalPattern.AbstractFactory.PaymentApp.DomesticPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentProcessor;

public class DomesticPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Domestic Payment Processor");
    }
}
