package Exam4.Repository;

import Exam4.Domain.Coupon;
import Exam4.Domain.Customer;
import Exam4.Domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderRepository {

    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return new  ArrayList<>(orders);
    }

public List<Order> findByCustomer(Customer customer) {
   return  orders.stream().filter(order -> order.getCustomer().equals(customer)).collect(Collectors.toList());
}
    public List<Order> findByCoupon(Coupon coupon) {
        return orders.stream()
                .filter(order -> order.getCoupon() != null
                        && order.getCoupon().getCode().equals(coupon.getCode()))
                .collect(Collectors.toList());
    }

}
