package CarsInformaitons;

public class BMW extends Cars{
    private boolean sportPackage;
    public BMW(){
    }
    public BMW(String brand, String model, int year, String color, double price,boolean sportPackage){
        super(brand, model, year, color, price);
        this.sportPackage = sportPackage;
    }
    public boolean getSportPackage(){
        return sportPackage;
    }
    public void setSportPackage(boolean sportPackage){
        this.sportPackage = sportPackage;
    }
    }


