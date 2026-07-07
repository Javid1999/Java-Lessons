package PaymentCommission;

import java.time.LocalDateTime;

public class AzipsPayment extends Payment{
    private String senderBankcode;
    private String receiverBankcode;
    private String referenceNumber;
    public AzipsPayment() {
    }
    public AzipsPayment(long paymentId, double amount, String currency, String paymentMethod,
                        String status, LocalDateTime paymentDate, String transactionId,String senderBankcode,String receiverBankcode,String referenceNumber){
        super(paymentId,amount,currency,paymentMethod,status,paymentDate,transactionId);
        this.senderBankcode =senderBankcode;
        this.receiverBankcode =receiverBankcode;
        this.referenceNumber = referenceNumber;
    }
 @Override
 public double calculateCommission(double amount){
        return amount * 0.1;
 }
}
