package Comparator;

import java.util.Comparator;
import java.util.Objects;

public class Employeer {
    private String name;
    private int age;
    private double salary;
    private  String address;

    public Employeer(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employeer employeer = (Employeer) o;
        return getAge() == employeer.getAge() && Double.compare(getSalary(), employeer.getSalary()) == 0 && Objects.equals(getName(), employeer.getName()) && Objects.equals(getAddress(), employeer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSalary(), getAddress());
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
