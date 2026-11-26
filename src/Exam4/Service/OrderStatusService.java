package Exam4.Service;

import Exam4.Domain.Order;
import Exam4.Domain.OrderStatus;

public class OrderStatusService {
    public boolean updateStatus(Order order, OrderStatus newStatus) {

        OrderStatus currentStatus = order.getOrderStatus();

        if (currentStatus == OrderStatus.PENDING
                && newStatus == OrderStatus.PAID) {

            order.setOrderStatus(newStatus);
            return true;
        }

        if (currentStatus == OrderStatus.PAID
                && newStatus == OrderStatus.SHIPPED) {

            order.setOrderStatus(newStatus);
            return true;
        }

        if (currentStatus == OrderStatus.SHIPPED
                && newStatus == OrderStatus.DELIVERED) {

            order.setOrderStatus(newStatus);
            return true;
        }

        return false;
    }
}