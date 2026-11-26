package TestingBehavioralPatterns.Strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Card transfer passed -> " +amount);
    }
}
