package PaymentSystem;

public class Customer {
    private int id;
    private String name;
    private PaymentR paymentR;

    public Customer(int id, String name, PaymentR paymentR) {
        this.id = id;
        this.name = name;
        this.paymentR = paymentR;
    }
    public PaymentR getPaymentR() {
        return paymentR;
    }
}
