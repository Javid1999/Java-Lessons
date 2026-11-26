package LAB6.Provider;


    import java.math.BigDecimal;

    public class ProviderBAdapter implements PaymentProvider {

        private final ProviderB providerB;

        public ProviderBAdapter(ProviderB providerB) {
            this.providerB = providerB;
        }

        @Override
        public PaymentResult pay(BigDecimal amountAzn) {

            try {
                providerB.processPayment(amountAzn.doubleValue());

                return new PaymentResult(
                        true,
                        "Payment successful"
                );

            } catch (Exception e) {

                return new PaymentResult(
                        false,
                        "Provider B error: " + e.getMessage()
                );
            }
        }
    }

