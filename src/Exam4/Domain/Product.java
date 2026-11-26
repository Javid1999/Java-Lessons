package Exam4.Domain;

public class Product {

    private int id;
    private String name;
    private double price;
    private int stockQuantity;
    private Category category;

    public Product(int id, String name, double price, int stockQuantity, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
