package againlesson;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a =  sc.nextInt();

        System.out.println("Enter second number: ");
        int b =  sc.nextInt();

        System.out.println("Enter third number: ");
        int c =  sc.nextInt();

        int max = a > b ? a : b > a? b : a>c ? a : c;

        System.out.println(max);

        sc.close();
    }
}
