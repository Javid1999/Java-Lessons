package LAB6.Delivery;

public class SameDayDelivery  implements Delivery {

    @Override
    public double calculatePrice(double orderAmount) {
        return 15;
    }

    @Override
    public String getDeliveryTime() {
        return "Same day";
    }

    @Override
    public String getName() {
        return "Same-Day Delivery";
    }
}
