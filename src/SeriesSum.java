import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class SeriesSum {

    // Faktorial hesablayan metod
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x daxil et: ");
        double x = sc.nextDouble();

        System.out.print("n daxil et: ");
        int n = sc.nextInt();

        double S = 0;

        for (int i = 1; i <= n; i++) {

            double term = Math.pow(x, i) / factorial(i);

            // Tək və cüt işarələri
            if (i % 2 == 0) {
                S -= term;
            } else {
                S += term;
            }
        }

        System.out.println("S = " + S);
    }
}