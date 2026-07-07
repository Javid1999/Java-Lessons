package MoneyTransfers;

import java.util.Objects;

public class Account {
    private String accountNumber;
    private String ownerName;
    private boolean frozen;

    public Account(String accountNumber, String ownerName, boolean frozen) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.frozen = frozen;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && frozen == account.frozen && Objects.equals(ownerName, account.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, ownerName, frozen);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", ownerName='" + ownerName + '\'' +
                ", frozen=" + frozen +
                '}';
    }
}
