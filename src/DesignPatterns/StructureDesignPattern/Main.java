package DesignPatterns.StructureDesignPattern;

import DesignPatterns.StructureDesignPattern.Facade.InsuranceFacade;
import DesignPatterns.StructureDesignPattern.Proxy.DocumentServiceProxy;

public class Main {
    public static void main(String[] args) {


//        DocumentServiceProxy documentServiceProxy = new DocumentServiceProxy("ADMIN");
//    documentServiceProxy.getDocument("1520A");

        InsuranceFacade facade = new InsuranceFacade();
        facade.buyPolicy("Cavid99",1000);
    }

}
