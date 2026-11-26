package testingCreationalPattern.AbstractFactory.PaymentApp;

public interface PaymentFactory {
    PaymentProcessor createPaymentProcessor();
    PaymentValidator createPaymentValidator();
}
