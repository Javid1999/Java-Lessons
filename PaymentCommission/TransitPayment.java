package PaymentCommission;

import java.time.LocalDateTime;

public class TransitPayment extends Payment{
    private String sourceAccount;
    private String destinationAccount;
    private String intermediaryBank;
    private String routingNumber;
    private String transitReason;

    public TransitPayment(){}
    public TransitPayment(long paymentId, double amount, String currency, String paymentMethod,
                          String status, LocalDateTime paymentDate, String transactionId,String sourceAccount,String destinationAccount,String intermediaryBank,
                          String routingNumber,String transitReason){
        super(paymentId,amount,currency,paymentMethod,status,paymentDate,transactionId);
        this.sourceAccount =sourceAccount;
        this.destinationAccount = destinationAccount;
        this.intermediaryBank = intermediaryBank;
        this.routingNumber = routingNumber;
        this.transitReason = transitReason;
    }

    @Override
    public double calculateCommission(double amount) {
        double a= super.calculateCommission(amount);
         if (a>50){
             return 10;
         }
         else
            return a;

    }
}
