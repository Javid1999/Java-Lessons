package PaymentSystem;

import java.sql.SQLOutput;

public class CardPayment extends PaymentR implements  Refundable{


    public CardPayment(int id, double amount, PaymentStatus paymentStatus) {
        super(id, amount, paymentStatus);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Card Payment");
        setPaymentStatus(PaymentStatus.SUCCESS);

    }

    @Override
    public void refund() {
        System.out.println("Refunding Card Payment");
       setPaymentStatus(PaymentStatus.FAILED);
    }
}
