package BankAccountSystem;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {

        super(accountNumber, ownerName, balance);

        this.interestRate = interestRate;
    }

    @Override
    public double deposit(double amount) {
        return super.deposit(amount);
    }

    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }
}
