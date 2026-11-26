package DesignPatterns.abstract_factory.banking;

import DesignPatterns.abstract_factory.Developer;
import DesignPatterns.abstract_factory.ProductOwner;
import DesignPatterns.abstract_factory.ProjectTeamFactory;
import DesignPatterns.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
    public Tester  getTester() {
        return  new QATester();
    }
}
