package DesignPatterns.abstract_factory.website;

import DesignPatterns.abstract_factory.Developer;
import DesignPatterns.abstract_factory.ProductOwner;
import DesignPatterns.abstract_factory.ProjectTeamFactory;
import DesignPatterns.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }
    public Tester getTester() {
        return new ManualTester();
    }
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}
