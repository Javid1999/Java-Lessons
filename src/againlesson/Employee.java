package againlesson;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private double salary;


    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public void increaseSalary(double percent){
        salary += salary*(percent/100);
    }
    public void displayInfo(){
        System.out.println("OwnerName:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Salary:"+salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
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
        Employee employee = (Employee) o;
        return Double.compare(getSalary(), employee.getSalary()) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                " surname='" + surname + '\'' +
                " salary=" + salary +
                '}';
    }
}

