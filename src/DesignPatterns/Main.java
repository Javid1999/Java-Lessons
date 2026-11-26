package DesignPatterns;

import DesignPatterns.Singleton.*;

public class Main {

    public static void main(String[] args) {
//        SingleDbConnection dbConnection = SingleDbConnection.DBC;
//
//        dbConnection.addQuery("First query");
//        dbConnection.addQuery("Second query");
//
//        dbConnection.showQueries();
//
//        SingleDbConnection secondDbConnection = SingleDbConnection.DBC;
//        System.out.println(dbConnection);
//        System.out.println(secondDbConnection);
//
//        System.out.println(dbConnection == secondDbConnection);

//        System.out.println("Test Ingress");
//        System.out.println("One more line");
//
//        BankConfig bankConfig = BankConfig.getInstance();
//
//        BankConfig secondbankConfig = BankConfig.getInstance();
//
//        System.out.println(bankConfig==secondbankConfig);

//        BankConfiguration bank =  BankConfiguration.BANK_CONFIGURATION;
//        BankConfiguration secondbank = BankConfiguration.BANK_CONFIGURATION;
//
//        System.out.println(bank==secondbank);

        BankConfiguration bank1 = BankConfiguration.BANK_CONFIGURATION;
        BankConfiguration bank2 = BankConfiguration.BANK_CONFIGURATION;

        bank1.showConfiguration();

        System.out.println(bank1 ==  bank2);
    }
}
