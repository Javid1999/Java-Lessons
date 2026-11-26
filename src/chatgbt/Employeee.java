package chatgbt;

public class Employeee implements Comparable<Employeee> {


        String name;

    Employeee() {
            System.out.println("Default constructor");
        }

    Employeee(String name) {
            this.name = name;
            System.out.println("Parameterized constructor");
        }

    @Override
    public int compareTo(Employeee o) {
        return this.name.compareTo(o.name);
    }
}


