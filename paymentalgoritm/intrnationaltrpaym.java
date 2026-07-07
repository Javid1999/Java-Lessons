package paymentalgoritm;

public class intrnationaltrpaym extends Paymento{
    public intrnationaltrpaym(int paymentid, double amount) {
        super(paymentid, amount);
    }
    @Override
    public double calculatecommis(){
        return super.getAmount()*0.03;
    }
}
