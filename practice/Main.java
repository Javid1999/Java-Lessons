package practice;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        TransferService transferService = new ExternalTransferService();
        TransferService transferService1 = new InternalTransferService();
        System.out.println(calculateCommission(10, transferService1));
    }
    public static double calculateCommission(double amount,TransferService type) {

        return amount + type.getCommission() ;
    }
}
