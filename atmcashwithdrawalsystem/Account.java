package atmcashwithdrawalsystem;

import java.util.Objects;

public class Account {
    private int accountNumber;;
    private String ownerName;
    private double balance;
    private boolean blocked;

    public Account(int accountNumber, String ownerName, double balance, boolean blocked) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.blocked = blocked;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getAccountNumber() == account.getAccountNumber() && Double.compare(getBalance(), account.getBalance()) == 0 && isBlocked() == account.isBlocked() && Objects.equals(getOwnerName(), account.getOwnerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getOwnerName(), getBalance(), isBlocked());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", blocked=" + blocked +
                '}';
    }
}
