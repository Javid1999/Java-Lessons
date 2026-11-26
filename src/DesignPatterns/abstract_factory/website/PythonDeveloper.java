package DesignPatterns.abstract_factory.website;

import DesignPatterns.abstract_factory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Python code");
    }
}
