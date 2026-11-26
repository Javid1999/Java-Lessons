package LAB6.Delivery;

public interface Delivery {

    double calculatePrice(double orderAmount);

    String getDeliveryTime();

    String getName();

}