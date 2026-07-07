package VehicleManagementSystem;

public class Main {
    public static void main(String[] args) {
        VehicleProcessor vehicleProcessor = new VehicleProcessor();
        Vehicle car = new Car(1,"bmw",VehicleType.CAR);

        vehicleProcessor.process(car);
        car.start();
    }
}
