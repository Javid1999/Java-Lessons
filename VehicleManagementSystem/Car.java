package VehicleManagementSystem;

public class Car extends Vehicle {
    public Car(int id, String brand, VehicleType vehicleType) {
        super(id, brand, vehicleType);
    }

    @Override
    void start() {
        System.out.println("Starting Car");

    }

    @Override
    public int calculateInsurance() {
        return 100;
    }
}
