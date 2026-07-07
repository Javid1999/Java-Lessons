package CarsInformaitons;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Cars carsOne = new Cars("BMW","F10",2008,"BLACK",0);
        Cars carsOne1 = new Cars("BMW","F10",2008,"BLACK",0);
        System.out.println(carsOne.equals(carsOne1));
        System.out.println(carsOne);

        int firstHashCode = carsOne.hashCode();
        int secondHashCode = carsOne1.hashCode();

        System.out.println(firstHashCode);
        System.out.println(secondHashCode);
        System.out.println(firstHashCode==secondHashCode );

        carsOne.setPrice(-2000);
        cars.setPrice(1000);
        System.out.println(carsOne.getPrice());
        System.out.println(cars);

        BMW bmw = new BMW();
        BMW bmwOne = new BMW("BMW","f30",2022,"WHITE",55000,false);
        bmwOne.setColor("BLACK");
        bmwOne.setModel("X5");
        System.out.println(bmwOne.getModel());

    }
}
