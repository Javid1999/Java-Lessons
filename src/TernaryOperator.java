import java.io.Serializable;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num_one = sc.nextInt();

        System.out.println("Enter second number: ");
        int num_two = sc.nextInt();

        System.out.println("Enter third number: ");
        int num_three = sc.nextInt();

        int  max  = num_one>num_two
                ? num_one>num_three ? num_one : num_three
                : num_two >num_three ? num_two : num_three;

        System.out.println("Max number: " +max);
        sc.close();
    }
}
