package Exam4.Service;

import Exam4.Domain.Category;
import Exam4.Domain.Product;
import Exam4.Repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    public List<Product> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    public List<Product> findByPriceRange(double minPrice, double maxPrice){
        return productRepository.findByPriceRange(minPrice, maxPrice);
    }
}
