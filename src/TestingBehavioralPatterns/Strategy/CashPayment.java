package TestingBehavioralPatterns.Strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
            System.out.println("Cash transfer passed -> " +amount);
    }
}
