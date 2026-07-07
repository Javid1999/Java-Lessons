package genericclasses;

public class GenericEmployee <T, U>{

    private T id;
    private T salary;
    private U name;

    public GenericEmployee(T id, U name){

    }

    public GenericEmployee(T id, T salary, U name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }
}
