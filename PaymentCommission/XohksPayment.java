package PaymentCommission;

import java.time.LocalDateTime;

public class XohksPayment extends Payment{
    private String payerAccount;
    private String payeeAccount;
    private String documentNumber;
     public XohksPayment(){}
     public XohksPayment(long paymentId, double amount, String currency, String paymentMethod,
                         String status, LocalDateTime paymentDate, String transactionId,String payerAccount,String payeeAccount,String documentNumber){
         super(paymentId,amount,currency,paymentMethod,status,paymentDate,transactionId);
         this.payeeAccount = payeeAccount;
         this.payerAccount = payerAccount;
         this.documentNumber = documentNumber;
     }
    @Override
    public double calculateCommission(double amount){
        return amount * 0.7;
    }
}
