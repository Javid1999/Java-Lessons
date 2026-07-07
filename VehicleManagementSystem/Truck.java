package VehicleManagementSystem;

public class Truck extends Vehicle {
    public Truck(int id, String brand, VehicleType vehicleType) {
        super(id, brand, vehicleType);
    }

    @Override
    void start() {
        System.out.println("Starting Truck");

    }

    @Override
    public int calculateInsurance() {
        return 300;
    }
}
