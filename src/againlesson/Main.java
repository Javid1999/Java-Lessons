package againlesson;

import againlesson.BankAccountSystem.BankAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal balance = new BigDecimal("0.00");
      BankAccount bankAccount = new BankAccount("AZE10041231",balance);


      bankAccount.deposit(new BigDecimal("100.00"));

        System.out.println(bankAccount.getBalance());


        bankAccount.withdraw(new BigDecimal("500.00"));

        System.out.println(bankAccount.getBalance());
    }
}
