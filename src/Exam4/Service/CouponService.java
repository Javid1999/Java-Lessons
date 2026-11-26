package Exam4.Service;

import Exam4.Domain.Coupon;
import Exam4.Repository.OrderRepository;

import java.time.LocalDateTime;

public class CouponService {
    private OrderRepository orderRepository;
    public CouponService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public boolean validateCoupon(Coupon coupon,double orderAmount) {
        LocalDateTime expireDate = coupon.getExpirationDate().atStartOfDay();
        LocalDateTime sysdate = LocalDateTime.now();
         if(expireDate.isBefore(sysdate)){
             return false;
         }
           if (coupon.getMinOrderAmount()>orderAmount) {
               return false;
           }
        int usageCount = orderRepository.findByCoupon(coupon).size();

           if (usageCount >= coupon.getUsageLimit()){
               return false;
           }
           return true;
    }
}
