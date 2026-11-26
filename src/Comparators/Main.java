package Comparators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();



        products.add(new Product(1, "iPhone", 1200, 4.8));
        products.add(new Product(2, "Samsung", 900, 4.5));
        products.add(new Product(3, "Laptop", 2500, 4.9));
        products.add(new Product(4, "Headphones", 150, 4.2));


        ProductSortingService productSortingService = new ProductSortingService();
        PriceSortType selectedSort = PriceSortType.PRICE_DESC;
        products.sort(productSortingService.getComparator(selectedSort));

        products.forEach(System.out::println);

        System.out.println("Product count: " + products.size());

    }
}
