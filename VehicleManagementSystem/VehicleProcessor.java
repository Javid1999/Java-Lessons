package VehicleManagementSystem;

public class VehicleProcessor {
    public void process(Vehicle vehicle) {
        vehicle.start();
        if (vehicle instanceof Insurable){
            System.out.println(vehicle.calculateInsurance());
        }
        else  {
            System.out.println("komissiya yoxdur");
        }
    }
}
