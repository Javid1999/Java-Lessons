package DesignPatterns.abstract_factory.banking;

import DesignPatterns.abstract_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("<UNK> <UNK>");
    }
}
