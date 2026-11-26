package Exam4.Domain;

import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderItem> orderItems;
    private Address address;
    private Coupon coupon;
    private OrderStatus orderStatus;
    private double finalTotal;

public Order (Customer customer, List<OrderItem> orderItems, Address address, Coupon coupon, OrderStatus orderStatus,double finalTotal) {
    this.customer = customer;
    this.orderItems = orderItems;
    this.address = address;
    this.coupon = coupon;
    this.orderStatus = orderStatus;
    this.finalTotal = finalTotal;
}

public Customer getCustomer() {
    return customer;
}
public List<OrderItem> getOrderItems() {
    return orderItems;
}
public Address getAddress() {
    return address;
}
public Coupon getCoupon() {
    return coupon;
}
public OrderStatus getOrderStatus() {
        return orderStatus;
}
    public double getFinalTotal() {
        return finalTotal;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
    }

}
