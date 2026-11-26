package againlesson;

import java.util.Objects;

public class Employeer {
    private String name;
    private double salary;
    public Employeer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employeer employeer = (Employeer) o;
        return Double.compare(getSalary(), employeer.getSalary()) == 0 && Objects.equals(getName(), employeer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary());
    }

    @Override
    public String toString() {
        return
                "name=" + name + "\n"+
                "salary=" + salary ;
    }
}
