package DesignPatterns.Singleton;

public class BankConfig {
    public static BankConfig instance;

    private BankConfig(){}
    public static BankConfig getInstance(){
        if (instance == null){
            instance = new BankConfig();
        }
        return instance;
    }

}
