package PaymentCommission;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Payment {
    private long paymentId;
    private double amount;
    private String currency;
    private String paymentMethod;
    private String status;
    private LocalDateTime paymentDate;
    private String transactionId;

    public Payment(){}

    public Payment( long paymentId,double amount,String currency,String paymentMethod,
        String status, LocalDateTime paymentDate,String transactionId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.paymentDate = paymentDate;
        this.transactionId = transactionId;

    }
    public long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(long paymentId){
        this.paymentId=paymentId;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod=paymentMethod;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public LocalDateTime getPaymentDate(){
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate){
        this.paymentDate=paymentDate;
    }
    public String getTransactionId(){
        return  transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
//    public double calculateCommission(double  amount){
//        return amount*0.2;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return  true;}
        if (o == null ||  getClass() != o.getClass()) {
            return  false;
        }
        Payment payment = (Payment) o;
        return paymentId == payment.paymentId
                && Double.compare(payment.amount, amount) == 0
                && Objects.equals(currency, payment.currency)
                && Objects.equals(paymentMethod, payment.paymentMethod)
                && Objects.equals(status, payment.status)
                && Objects.equals(paymentDate, payment.paymentDate)
                && Objects.equals(transactionId, payment.transactionId);

    }
    @Override
    public int hashCode() {
        return Objects.hash(paymentId,amount,currency,paymentMethod,status,paymentDate,transactionId);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", paymentDate=" + paymentDate +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
    public double calculateCommission(double amount){
        return amount * 0.2;
    }

//    public  double calculateCommission(int amount) {
//        return amount * 0.8;
//    };
}
