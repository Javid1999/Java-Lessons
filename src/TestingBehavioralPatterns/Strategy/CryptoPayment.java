package TestingBehavioralPatterns.Strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Crypto Payment -> " + amount);
    }
}
