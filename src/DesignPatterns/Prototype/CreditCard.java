package DesignPatterns.Prototype;

public class CreditCard implements  Cloneable{
    private String cardHolder;
    private String bankName;
    private String currency;
    private Double creditLimit;;

    public CreditCard(String cardHolder, String bankName, String currency, Double creditLimit){
        this.cardHolder = cardHolder;
        this.bankName = bankName;
        this.currency = currency;
        this.creditLimit = creditLimit;
    }
    public CreditCard clone(){
        try {
            return (CreditCard) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
