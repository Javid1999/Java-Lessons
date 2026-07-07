package paymentalgoritm;

public class Main {
    public static void main(String[] args) {
        Paymento payment = new Internaltrpymr(1,500);
        System.out.println(payment.calculatecommis());
        double endcom = payment.getAmount()- payment.calculatecommis();
        System.out.println(endcom);


        Paymento paymentq  = new intrnationaltrpaym(1,600);
        System.out.println(paymentq.calculatecommis());
        double endcomq= paymentq.getAmount()- paymentq.calculatecommis();
        System.out.println(endcomq);

        Paymento payment1  = new cardpayment(1,500);
        System.out.println(payment1.calculatecommis());
        double endcom1 = payment1.getAmount()- payment1.calculatecommis();
        System.out.println(endcom1);
    }
}
