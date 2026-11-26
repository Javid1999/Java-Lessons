package compo;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Cavid", 27, 2147.0));
        employees.add(new Employee("Ali", 25, 2500.0));
        employees.add(new Employee("Nigar", 30, 1800.0));
        employees.add(new Employee("Samir", 28, 3200.0));
        employees.add(new Employee("Aysel", 24, 2900.0));
        employees.add(new Employee("Murad", 32, 1500.0));
        employees.add(new Employee("Rauf", 29, 2500.0));


//       List<Employee> emp = employees.stream().filter(e->e.getAge()>25)
//                .sorted(Comparator.comparing(Employee::getSalary))
//               .toList();

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getSalary);
        List<Employee> emp = new ArrayList<>();
        for( Employee employee : employees){
            if (employee.getAge()>25) {
                emp.add(employee);
            }
        }
emp.sort(employeeComparator);




       // System.out.println(emp);

        emp.forEach(e->System.out.println(e.getName()));
    }

    }

