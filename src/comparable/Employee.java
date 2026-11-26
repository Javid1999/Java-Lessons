package comparable;

import java.util.Objects;

public class Employee  {

    private String name;

    private Double salary;

    private Integer age;

    public Employee(String name, Double salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getAge(), employee.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getAge());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        int result = this.salary.compareTo(o.getSalary());
//
//        if (result != 0) {
//            return result;
//        }
//
//        result = this.age.compareTo(o.getAge());
//
//        if (result != 0) {
//            return result;
//        }
//
//        return this.name.compareTo(o.getName());

//    }
}
