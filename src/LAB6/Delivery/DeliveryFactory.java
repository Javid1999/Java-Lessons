package LAB6.Delivery;

public class DeliveryFactory {


    public static Delivery createDelivery(DeliveryType type) {

        switch (type) {


            case SAME_DAY:
                return new SameDayDelivery();

            case POSTAL_BOX:
                return new PostalBoxDelivery();

            default:
                throw new IllegalArgumentException(
                        "Unknown delivery method: " + type
                );
        }
    }
}
