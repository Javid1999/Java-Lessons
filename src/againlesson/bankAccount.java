package againlesson;

import java.util.Objects;

public class bankAccount {

    private String accountNumber;

    private String ownerName;

    private  double balance;

    public bankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("invalid amount");
        }
    }
     public void withdraw(double amount) {
        if (amount<=0){
            System.out.println("invalid amount");
        }
        else if (amount>balance) {
            System.out.println("insufficient balance");
        }
        else {
            this.balance -= amount;
        }
     }
     public void showBalance() {
        System.out.println("Owner name: "+ownerName);
         System.out.println("balance: "+balance);
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        bankAccount that = (bankAccount) o;
        return Double.compare(getBalance(), that.getBalance()) == 0 && Objects.equals(getAccountNumber(), that.getAccountNumber()) && Objects.equals(getOwnerName(), that.getOwnerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getOwnerName(), getBalance());
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
