package LAB6.Provider;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class providerAAdapter implements PaymentProvider {
    private final ProviderA providerA;

    public providerAAdapter(ProviderA providerA) {
        this.providerA = providerA;
    }


    @Override
    public PaymentResult pay(BigDecimal amountAzn) {

        int amountInCents = amountAzn
                .multiply(BigDecimal.valueOf(100))
                .setScale(0, RoundingMode.HALF_UP)
                .intValueExact();

        String errorCode = providerA.makePayment(amountInCents);

        if ("00".equals(errorCode)) {
            return new PaymentResult(true, "Payment successful");
        }

        return new PaymentResult(false,
                "Provider A error: " + errorCode);
    }
}



