package generics;

import java.util.Scanner;
public class calculate {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);


        double netice;

        System.out.println("Birinci ededi daxil edin: ");
        double n = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        double m = sc.nextInt();

        System.out.println(" emeliyyati daxil edin(+, -, *, /): " );
        char c = sc.next().charAt(0);

         if (c == '*') {
             netice = n * m;
             System.out.println(n + "*" + m + "=" + netice);
         }
             else if (c == '/') {
             netice = n / m;
             System.out.println(n + "/" + m + "=" + netice);
             }
             else if (c == '+'){
                 netice = n + m;
             System.out.println(n + "+" + m + "=" +netice);
         }
             else if (c == '-') {
                 netice = n-m ;
             System.out.println(n + "-" + m + "=" +netice);
         }
             else
             System.out.println("Yanlis parametr");

         }

}
