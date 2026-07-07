package PaymentSystem;

public class TransferPayment extends PaymentR implements Refundable {
    public TransferPayment(int id, double amount, PaymentStatus paymentStatus) {
        super(id, amount, paymentStatus);
    }

    @Override
    void processPayment() {
        System.out.println("Transfer is initiated");
       setPaymentStatus(PaymentStatus.PENDING);
    }

    @Override
    public void refund() {
        System.out.println("Refunding Card Payment");
        setPaymentStatus(PaymentStatus.FAILED);

    }
}
