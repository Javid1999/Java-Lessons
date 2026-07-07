package PaymentCommission;

public class Main {
    public static void main(String[] args) {
//        Payment payment = new InternalTransferPayment();
//        double commission = payment.calculateCommission(200);
//        System.out.println(commission);
//
//        AzipsPayment a = new AzipsPayment();
//        double commission2 = a.calculateCommission(200);
//        System.out.println(commission2);

        TransitPayment t = new TransitPayment();
        double commission3 = t.calculateCommission(200);
        System.out.println(commission3);

//        XohksPayment x = new XohksPayment();
//
//        double commission4 = x.calculateCommission(200);
//        System.out.println(commission4);
    }
}
