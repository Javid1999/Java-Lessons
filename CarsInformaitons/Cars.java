package CarsInformaitons;

import java.util.Objects;

public class  Cars {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;

    public Cars() {
    }

    public Cars(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("price can't be negative");;
        }
        else this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        return year == cars.year
                && Double.compare(cars.price, price) == 0
                && Objects.equals(brand, cars.brand)
                && Objects.equals(model, cars.model)
                && Objects.equals(color, cars.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, color, price);
    }
    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
