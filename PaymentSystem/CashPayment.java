package PaymentSystem;

import java.sql.SQLOutput;

public class CashPayment extends PaymentR{
    public CashPayment(int id, double amount, PaymentStatus paymentStatus) {
        super(id, amount, paymentStatus);
    }


    @Override
    void processPayment() {
        System.out.println("Processing Cash Payment");
        setPaymentStatus(PaymentStatus.SUCCESS);
    }
}
