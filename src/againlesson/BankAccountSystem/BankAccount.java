package againlesson.BankAccountSystem;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        this.accountNumber = accountNumber;

        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("balance cannot be negative");
        }
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.balance= this.balance.add(amount);

    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0 || amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("Amount must be positive and cannot exceed balance");
        }
        this.balance= this.balance.subtract(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
