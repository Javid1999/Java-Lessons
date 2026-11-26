package DesignPatterns.StructureDesignPattern.Facade;

public class PolicyService {

    public void createPolicy(String customerId) {
        System.out.println("Policy created for: " + customerId);
    }
}
