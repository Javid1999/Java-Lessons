package PaymentSystem;

import PaymentCommission.Payment;

import java.sql.SQLOutput;

public class PaymentProcessor {
    public void process(PaymentR paymentR) {
        paymentR.processPayment();
        if(paymentR instanceof Refundable){
            System.out.println("Refund supported");
        }
        else {
            System.out.println("Refund not supported");
        }

    }
}
