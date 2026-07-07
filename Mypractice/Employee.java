package Mypractice;

public class Employee extends Person{
    private  double salary;
    public Employee(){
    }
    public Employee(String name,String surname,double salary){
        super(name,surname);
        this.salary=salary;
    }
    public void setSalary(double salary){
        if (salary>10000){
            System.out.println("cash limited");
            return;
        }
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}

