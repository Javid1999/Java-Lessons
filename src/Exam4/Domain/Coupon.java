package Exam4.Domain;

import Exam4.Service.DiscountStrategy;

import java.time.LocalDate;

public class Coupon {

    private  String code;
    private LocalDate expirationDate;
    private int usageLimit;
    private double minOrderAmount ;
    private DiscountStrategy discountStrategy;

    public Coupon(String code, LocalDate expirationDate, int usageLimit, double minOrderAmount, DiscountStrategy discountStrategy) {
        this.code = code;
        this.expirationDate = expirationDate;
        this.usageLimit = usageLimit;
        this.minOrderAmount = minOrderAmount;
        this.discountStrategy = discountStrategy;
    }

    public String getCode() {
        return code;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public int getUsageLimit() {
        return usageLimit;
    }
    public double getMinOrderAmount() {
        return minOrderAmount;
    }
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;

    }
}
