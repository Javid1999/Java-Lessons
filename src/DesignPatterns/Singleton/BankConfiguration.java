package DesignPatterns.Singleton;

public enum BankConfiguration {
    BANK_CONFIGURATION("ABB","AZN",50000.0);

    private final String bankName;
    private final String currency;
    private final Double maxTransferLimit;

    private BankConfiguration(String bankName, String currency, double maxTransferLimit){
        this.bankName = bankName;
        this.currency = currency;
        this.maxTransferLimit = maxTransferLimit;
    }

    public void showConfiguration(){
        System.out.println(bankName);
        System.out.println(currency);
        System.out.println(maxTransferLimit);
    }


}
