package Mypractice;

import java.util.Objects;

public class Cars {
    private String brand;
    private String model;
    private int year;

    public Cars(){}
    public Cars(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return year == cars.year && Objects.equals(brand, cars.brand) && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
