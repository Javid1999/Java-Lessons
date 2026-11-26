package javalesson19task;

import java.math.BigDecimal;

public record Payment(
        int id,
        String senderAccount,
        String receiverAccount,
        BigDecimal amount,
        String currency
) {}
