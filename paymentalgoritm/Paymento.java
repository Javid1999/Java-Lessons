package paymentalgoritm;

public  class Paymento {
    private int paymentid;
    private double amount;

    public Paymento(int paymentid, double amount) {
        this.paymentid = paymentid;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public  double calculatecommis(){
        return 0;
    }
}
