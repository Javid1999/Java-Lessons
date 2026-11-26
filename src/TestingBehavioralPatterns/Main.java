package TestingBehavioralPatterns;

import TestingBehavioralPatterns.Strategy.CardPayment;
import TestingBehavioralPatterns.Strategy.CryptoPayment;
import TestingBehavioralPatterns.Strategy.PaymentContext;
import TestingBehavioralPatterns.Strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
       PaymentStrategy strategy = new CryptoPayment();

       PaymentContext context = new PaymentContext(strategy);

       context.executePayment(100);

       context.setPaymentStrategy(new CardPayment());

       context.executePayment(5000);
    }
}
