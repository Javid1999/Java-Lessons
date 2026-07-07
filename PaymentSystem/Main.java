package PaymentSystem;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentR card = new CardPayment(1, 500, PaymentStatus.PENDING);
        PaymentR cash = new CashPayment(2, 300, PaymentStatus.PENDING);
        PaymentR transfer = new TransferPayment(3, 700, PaymentStatus.PENDING);

        Customer c1 = new Customer(1,"Cavid",card);


        paymentProcessor.process(card);
        paymentProcessor.process(cash);
        paymentProcessor.process(transfer);
        //paymentR.processPayment();
    }
}
