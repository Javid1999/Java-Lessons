package LAB6;

import LAB6.Delivery.Delivery;
import LAB6.Delivery.DeliveryFactory;

import static LAB6.Delivery.DeliveryType.POSTAL_BOX;

public class Main {

    public static void main(String[] args) {

        double orderAmount = 40;

        Delivery delivery =
                DeliveryFactory.createDelivery(POSTAL_BOX);

        System.out.println("Delivery: " + delivery.getName());

        System.out.println("Price: "
                + delivery.calculatePrice(orderAmount) + " AZN");

        System.out.println("Time: "
                + delivery.getDeliveryTime());
    }
}