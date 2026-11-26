package DesignPatterns.StructureDesignPattern.Facade;

public class PricingService {
    public double calculatePrice(double insuredAmount){
        double price = insuredAmount* 0.05;

        System.out.println("Insurance price: " + price);
     return price;
    }
}
