package VehicleManagementSystem;

public class Motorcycle extends Vehicle {
    public Motorcycle(int id, String brand, VehicleType vehicleType) {
        super(id, brand, vehicleType);
    }

    @Override
    void start() {
        System.out.println("Starting Motorcycle");

    }

    @Override
    public int calculateInsurance() {
        return 50;
    }
}
