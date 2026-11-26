package DesignPatterns.abstract_factory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    ProductOwner getProductOwner();

    Tester getTester();
}
