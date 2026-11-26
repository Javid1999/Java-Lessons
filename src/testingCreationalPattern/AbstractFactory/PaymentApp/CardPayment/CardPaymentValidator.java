package testingCreationalPattern.AbstractFactory.PaymentApp.CardPayment;

import testingCreationalPattern.AbstractFactory.PaymentApp.PaymentValidator;

public class CardPaymentValidator implements PaymentValidator {
    @Override
    public void validatePayment() {
        System.out.println("Validating Card Payment");
    }
}
