package TestingBehavioralPatterns.Strategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Bank transfer passed  -> " +amount);
    }
}
