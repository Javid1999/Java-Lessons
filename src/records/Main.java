package records;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product  = new Product(1L,"iPhone", new BigDecimal("1200"));

        Product product1 = new Product(1L,"iPhone", new BigDecimal("1200"));

        System.out.println(product.equals(product1));

        System.out.println(product.id());
        System.out.println(product.name());
        System.out.println(product.price());

        System.out.println(product);
    }
}
