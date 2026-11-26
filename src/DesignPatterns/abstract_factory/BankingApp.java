package DesignPatterns.abstract_factory;

import DesignPatterns.abstract_factory.banking.BankingTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProductOwner productOwner = projectTeamFactory.getProductOwner();

        System.out.println("Building banking app");

        developer.writeCode();
        tester.testCode();
        productOwner.manageProduct();
    }
}
