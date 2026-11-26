package LAB6.Delivery;

public class PostalBoxDelivery  implements Delivery {

    @Override
    public double calculatePrice(double orderAmount) {
        if (orderAmount >= 50) {
            return 0;
        }

        return 3;
    }

    @Override
    public String getDeliveryTime() {
        return "2 days";
    }

    @Override
    public String getName() {
        return "Postal Box Delivery";
    }
}
