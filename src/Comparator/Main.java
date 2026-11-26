package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       Comparator <Employeer> namelength =
               Comparator.comparingInt(employeer -> employeer.getName().length());

       Employeer[] employeers = new Employeer[3];

       employeers[0] = new Employeer("Cavid",27,2380,"Baku123");
       employeers[1] = new Employeer("Ceyhun",34,3620,"Yasamal22");
       employeers[2] = new Employeer("Vuqar",34,3900,"Goycay1");

        Arrays.sort(employeers,Comparator.comparing(Employeer::getSalary)
                .thenComparing(namelength)
                .thenComparing(Employeer :: getAge));
        System.out.println(Arrays.toString(employeers));
    }
}
