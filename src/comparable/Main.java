package comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("javid",27));
//        students.add(new Student("jeyhun",35));
//        students.add(new Student("Sahil",32));
//        Collections.sort(students);
//
//        for(Student student : students){
//            System.out.println(student);
//        }
//
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new Employee("Javid",2380.00,28));
//        employees.add(new Employee("Julia",2380.00,30));
//        employees.add(new Employee("Jeyhun",3580.00,28));
//
//        Collections.sort(employees);
//
//        for (Employee e : employees) {
//            System.out.println(e);
//        }

//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product("Laptop", 100.00));
//        products.add(new Product("Tablet", 200.00));
//        products.add(new Product("Mouse", 300.00));
//        products.add(new Product("Keyboard", 400.00));
//
//        Collections.sort(products);
//
//        for (Product p : products) {
//            System.out.println(p);
//        }

//        List<Book> books = new ArrayList<>();
//
//        books.add(new Book("Java",500));
//        books.add(new Book("SQL",300));
//        books.add(new Book("C++",200));
//        books.add(new Book("Python",100));
//
//        Collections.sort(books);
//
//        for (Book b : books) {
//            System.out.println(b);
//        }
//     List<Intern> interns = new ArrayList<>();
//
//     interns.add(new Intern("Cavid",90));
//     interns.add(new Intern("Jeyhun",99));
//     interns.add(new Intern("Murad",60));
//     interns.add(new Intern("Haci",88));
//
//     Collections.sort(interns);
//
//     for (Intern intern : interns) {
//         System.out.println(intern);
//     }



//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new Employee("Javid", 2380.0, 27));
//        employees.add(new Employee("Julia", 1980.0, 25));
//        employees.add(new Employee("Jeyhun", 2380.0, 30));
//        employees.add(new Employee("Ali", 2380.0, 25));
//
//      employees.sort(Comparator.comparing(Employee :: getSalary).thenComparing(Employee::getAge).thenComparing(Employee::getName));
//
//
//        System.out.println(employees);
//
//        Comparator<Employee> nameLength =
//             Comparator.comparingInt((Employee employee) -> employee.getName().length()).reversed();
//
//        employees.sort(nameLength);
//
//
//
//        System.out.println(employees);

//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new Employee("Javid", 2380.0, 27));
//        employees.add(new Employee("Ali", 1980.0, 25));
//        employees.add(new Employee("Alexander", 3000.0, 30));
//        employees.add(new Employee("Jacad", 6400.0, 30));
//        employees.add(new Employee("Leyla", 2200.0, 24));
//        employees.add(new Employee("John", 2500.0, 28));
//        employees.add(new Employee("Michael", 2800.0, 32));
//
//      Comparator<Employee> comparator = Comparator.comparingInt((Employee employee) -> employee.getName().length())
//              .reversed()
//              .thenComparing(
//                      Comparator.comparing(Employee::getSalary)
//                         .reversed()
//              )
//              .thenComparing(Employee::getAge);
//      employees.sort(comparator);
//        System.out.println(employees);

//
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new Employee("Javid", 2380.0, 27));
//        employees.add(new Employee("Ali", 1980.0, 25));
//        employees.add(new Employee("Alexander", 3000.0, 30));
//        employees.add(new Employee("Jacad", 3000.0, 25));
//        employees.add(new Employee("Leyla", 2200.0, 24));
//        employees.add(new Employee("John", 2500.0, 28));
//        employees.add(new Employee("Michael", 2800.0, 32));
//        employees.add(new Employee("Julia", 3000.0, 25));
//
//        Comparator<Employee> comparatorEmployee =  Comparator.comparing(Employee::getSalary)
//                .reversed()
//                .thenComparing(
//                        Comparator.comparingInt((Employee employee) -> employee.getName().length())
//                        .reversed()
//                )
//                        .thenComparing(Employee::getAge)
//                        .thenComparing(Employee::getName)
//                 ;
//
//employees.sort(comparatorEmployee);
//        System.out.println(employees);
//
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Javid", 2380.0, 27));
        employees.add(new Employee("Ali", 1980.0, 25));
        employees.add(new Employee("Alexander", 3000.0, 30));
        employees.add(new Employee("Jacad", 6400.0, 30));
        employees.add(new Employee("Leyla", 2200.0, 24));
        employees.add(new Employee("John", 2500.0, 28));
        employees.add(new Employee("Michael", 2800.0, 32));
//
//        Comparator<Employee> comparator =
//                (e1, e2) ->e2.getSalary().compareTo( e1.getSalary());
//        employees.sort(comparator);
//        System.out.println(employees);


//        Comparator<Employee> comparator =
//                (e1, e2) -> {
//                    int result = e2.getSalary().compareTo(e1.getSalary());
//                    if (result != 0) {
//                      return result;
//                    }
//                    result = e1.getAge().compareTo(e2.getAge());
//
//                    if (result != 0) {
//                         return  result;
//                     }
//                     return e1.getName().compareTo(e2.getName());
//                };

        Comparator<Employee> comparator =
          (e1,e2) -> {
          int result = Double.compare(
                  e2.getSalary(), e1.getSalary()

        );

        if (result != 0) {
        return result;

          }
        result = Integer.compare(e1.getAge(), e2.getAge()
        );
        if (result != 0) {
        return result;}
        return e1.getName().compareTo(e2.getName());
          }  ;


        }


    }

