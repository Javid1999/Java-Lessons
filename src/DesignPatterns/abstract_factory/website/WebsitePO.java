package DesignPatterns.abstract_factory.website;

import DesignPatterns.abstract_factory.ProductOwner;

public class WebsitePO implements ProductOwner {

    @Override
    public void manageProduct() {
        System.out.println("Manage Website");
    }
}
