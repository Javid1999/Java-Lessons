package Exam4.Repository;

import Exam4.Domain.Category;
import Exam4.Domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Product findById(int id){
        return products.stream().filter(product -> product.getId()==id).findFirst().orElse(null);
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>( products);
    }

    public List<Product> findByCategory(Category category){
        return products.stream().filter(product -> product.getCategory().equals(category)).collect(Collectors.toList());
    }
    public List<Product> findByPriceRange(double minPrice, double maxPrice){
        return products.stream().filter(pr -> pr.getPrice()>=minPrice && pr.getPrice()<=maxPrice).collect(Collectors.toList());
    }
}
