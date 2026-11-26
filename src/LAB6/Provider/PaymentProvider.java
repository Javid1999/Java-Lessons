package LAB6.Provider;

import java.math.BigDecimal;

public interface PaymentProvider {

    PaymentResult pay(BigDecimal amountAzn);

}