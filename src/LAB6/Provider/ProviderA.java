package LAB6.Provider;

public class ProviderA {

    public String makePayment(int amountInCents) {

        System.out.println("Provider A: "
                + amountInCents + " cents received");

        return "00";
    }
}