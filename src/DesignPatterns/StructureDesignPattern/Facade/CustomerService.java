package DesignPatterns.StructureDesignPattern.Facade;

public class CustomerService {

    public boolean validateCustomer(String customerId){
        System.out.println("Validating customer: " + customerId);
        return true;
    }
}
