package BankAccountSystem;

public class Main {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("AZ10001", "Javid", 500);

        // Hesaba 200 AZN yatır
        account.deposit(200.00);

        // Balansını göstər
        System.out.println(account.getBalance());

        // 300 AZN çıxar

        account.withdraw(300.0);

        // Son balansı göstər
        System.out.println(account.getBalance());
    }
}