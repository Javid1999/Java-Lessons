package DesignPatterns.abstract_factory.website;

import DesignPatterns.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode()
    {
        System.out.println("ManualTester testCode");
    }
}
