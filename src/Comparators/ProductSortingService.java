package Comparators;

import java.util.Comparator;

public class ProductSortingService {

    public Comparator<Product> getComparator(PriceSortType sortType) {
     return   switch (sortType) {
            case PRICE_DESC -> Comparator.comparing(Product::getPrice).reversed();
            case RATING_DESC -> Comparator.comparing(Product::getRating).reversed();
            case PRICE_ASC -> Comparator.comparing(Product::getPrice);
        };
    }

}