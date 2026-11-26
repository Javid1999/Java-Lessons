package testingCreationalPattern.AbstractFactory.PaymentApp.InternationalPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentValidator;

public class InternationalPaymentValidator implements PaymentValidator {
    @Override
    public void validatePayment() {
        System.out.println("International Payment Validator");
    }
}
