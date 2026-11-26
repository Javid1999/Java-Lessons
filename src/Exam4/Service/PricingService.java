package Exam4.Service;

import Exam4.Domain.Address;
import Exam4.Domain.Cart;
import Exam4.Domain.CartItem;
import Exam4.Domain.Coupon;

public class PricingService {

    public double calculateSubtotal(Cart cart) {
        double subtotal = 0;

        for (CartItem cartItem : cart.getCartItems()) {
            subtotal += cartItem.getTotalPrice();
        }

        return subtotal;
    }

    public double calculateDiscount(double subtotal, Coupon coupon) {
        if (coupon == null) {
            return 0;
        }

        return coupon.getDiscountStrategy()
                .calculateDiscount(subtotal);
    }

    public double calculateShipping(Address address) {
        if (address.getCity().equalsIgnoreCase("Baku")) {
            return 5;
        } else if (address.getCity().equalsIgnoreCase("Agdam")) {
            return 10;
        } else {
            return 35;
        }
    }

    public double calculateTax(double totalBeforeTax) {
        return totalBeforeTax * 0.18;
    }

    public double calculateFinalTotal(double subtotal,
                                      double discount,
                                      double shippingFee,
                                      double tax) {

        return subtotal - discount + shippingFee + tax;
    }
}