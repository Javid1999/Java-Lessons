package Exam4.Service;



public class FixedDiscount implements DiscountStrategy {

    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }
    @Override
    public double calculateDiscount(double orderAmount) {
        return amount;
    }
}
