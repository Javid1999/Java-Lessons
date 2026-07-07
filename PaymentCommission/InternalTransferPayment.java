package PaymentCommission;

import java.time.LocalDateTime;

public class InternalTransferPayment extends Payment {
    private String senderAccount;
    private String receiverAccount;
    private String transferType;

    public InternalTransferPayment() {
    }

    public InternalTransferPayment(long paymentId, double amount, String currency, String paymentMethod,
                                   String status, LocalDateTime paymentDate, String transactionId, String senderAccount, String receiverAccount, String transferType) {
        super(paymentId, amount, currency, paymentMethod, status, paymentDate, transactionId);
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
    }
    @Override
    public double calculateCommission(double amount){
        return amount * 0.4;
    }
}
