package LAB6.Provider;

public class ProviderC {
    public boolean executePayment(double amountUsd) {

        System.out.println("Provider C: "
                + amountUsd + " USD received");

        return true;
    }
}
