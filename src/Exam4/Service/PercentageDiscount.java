package Exam4.Service;

public class PercentageDiscount implements DiscountStrategy{

    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double orderAmount) {
        return orderAmount * percentage/100;
    }
}
