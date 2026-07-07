package PaymentSystem;

abstract class PaymentR {
    private int id;
    private double amount;
    private PaymentStatus paymentStatus;

    public PaymentR(int id, double amount, PaymentStatus paymentStatus) {
        this.id = id;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    abstract void processPayment();
}
