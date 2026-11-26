package Exam4.Service;

import Exam4.Domain.*;
import Exam4.Repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;

    private PricingService pricingService;

    private InventoryService inventoryService;

    private CouponService couponService;

    public OrderService(OrderRepository orderRepository,
                        PricingService pricingService,
                        InventoryService inventoryService,
                        CouponService couponService) {
        this.orderRepository = orderRepository;
        this.pricingService = pricingService;
        this.inventoryService = inventoryService;
        this.couponService =  couponService;
    }

    public Order checkout(Customer customer, Cart cart, Address address,Coupon coupon) {




        List<OrderItem> orderItems = new ArrayList<>();
        if (!inventoryService.validateStock(cart)) {
            System.out.println("Insufficient stock");
             return null;
        }

        if(coupon != null){
            double subTotal = pricingService.calculateSubtotal(cart);

            if (!couponService.validateCoupon(coupon, subTotal)) {
                System.out.println("Invalid coupon");
                return null;
            }

        }



        double subTotal = pricingService.calculateSubtotal(cart);

        double discount = pricingService.calculateDiscount(subTotal,coupon);

        double shippingFee = pricingService.calculateShipping(address);

        double totalBeforeTax = subTotal - discount + shippingFee;

        double tax = pricingService.calculateTax(totalBeforeTax);

        double finalTotal = pricingService.calculateFinalTotal(subTotal,
                discount,
                shippingFee,
                tax
        );



        for (CartItem cartItem : cart.getCartItems()) {

            OrderItem orderItem = new OrderItem(
                    cartItem.getProduct().getName(),
                    cartItem.getProduct().getPrice(),
                    cartItem.getQuantity()
            );
            orderItems.add(orderItem);

        }
        Order order = new Order(
                customer,
                orderItems,
                address,
                coupon,
                OrderStatus.PENDING,
                finalTotal
        );

        orderRepository.addOrder(order);

        inventoryService.reduceStock(cart);
           return order;
    }


}
