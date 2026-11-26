package testingCreationalPattern.AbstractFactory.PaymentApp.DomesticPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentValidator;

public class DomesticPaymentValidator implements PaymentValidator {
    @Override
    public void validatePayment() {
        System.out.println("Domestic Payment Validator");
    }
}
