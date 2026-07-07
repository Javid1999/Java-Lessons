package exceptions;

import java.util.Objects;

public class Customers {
    private int id;
    private String name;
    public int age;
    private double monthlyIncome;
    private boolean hasDelayedLoan;

    public Customers(int id, String name, int age, double monthlyIncome, boolean hasDelayedLoan) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.hasDelayedLoan = hasDelayedLoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public boolean isHasDelayedLoan() {
        return hasDelayedLoan;
    }

    public void setHasDelayedLoan(boolean hasDelayedLoan) {
        this.hasDelayedLoan = hasDelayedLoan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return id == customers.id && age == customers.age && Double.compare(monthlyIncome, customers.monthlyIncome) == 0 && hasDelayedLoan == customers.hasDelayedLoan && Objects.equals(name, customers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, monthlyIncome, hasDelayedLoan);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", monthlyIncome=" + monthlyIncome +
                ", hasDelayedLoan=" + hasDelayedLoan +
                '}';
    }
}
