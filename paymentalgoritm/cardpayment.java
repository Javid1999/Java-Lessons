package paymentalgoritm;

public class cardpayment extends Paymento{
    public cardpayment(int paymentid, double amount) {
        super(paymentid, amount);
    }
    @Override
    public double calculatecommis(){
        return super.getAmount()*0.01;
    }
}
