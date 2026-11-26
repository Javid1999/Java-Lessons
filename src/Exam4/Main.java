package Exam4;

import Exam4.Domain.*;
import Exam4.Repository.OrderRepository;
import Exam4.Repository.ProductRepository;
import Exam4.Repository.UserRepository;
import Exam4.Service.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        UserRepository userRepository = new UserRepository();
        OrderRepository orderRepository = new OrderRepository();

        ProductService productService = new ProductService(productRepository);
        CustomerService customerService = new CustomerService(userRepository);
        CouponService  couponService = new CouponService(orderRepository);
        PricingService pricingService = new PricingService();
        InventoryService inventoryService = new InventoryService();

        OrderService orderService = new OrderService(
                orderRepository,
                pricingService,
                inventoryService,
                couponService

        );

        Customer customer = new Customer(
                "Javid",
                "javid@gmail.com",
                "1234"
        );

        userRepository.addUser(customer);

        Product laptop = new Product(
                1,
                "Laptop",
                1500,
                10,
                Category.ELECTRONICS
        );



        productRepository.addProduct(laptop);


        Cart cart = new Cart();

        CartItem cartItem = new CartItem(laptop, 2);

        cart.addItem(cartItem);

        Coupon coupon = new Coupon(
                "SALE101",
                LocalDate.of(2026, 12, 31),
                100,
                20000,
                new PercentageDiscount(20)
        );

        Address address = new Address(
                "Baku",
                "M.Hadi",
                "AZ10117"
        );

        Order order = orderService.checkout(
                customer,
                cart,
                address,
                coupon
        );

OrderStatusService  orderStatusService = new OrderStatusService();
 if (order != null) {
        System.out.println("Final Total: " + order.getFinalTotal());
        System.out.println("Cart Quantity: " + cartItem.getQuantity());
        System.out.println("Remaining Stock: " + laptop.getStockQuantity());

     System.out.println("Current Status: " + order.getOrderStatus());

     boolean result = orderStatusService.updateStatus(order, OrderStatus.SHIPPED);

     System.out.println("Status updated: " + result);
     System.out.println("New Status: " + order.getOrderStatus());
    }


    }




}