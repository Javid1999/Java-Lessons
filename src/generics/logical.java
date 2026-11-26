package generics;

import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Reqemi daxil et:");
        int number = sc.nextInt();

        //System.out.println((5>3) && (8>5));
        //System.out.println((5>3) || (8<5));

        if (number == 5) {
            System.out.println("Orta seqment");
        }
        else if (number >5){
            System.out.println("Yuxari seqment");
        }
        else {
            System.out.println("Asagi seqment");
        }

        sc.close();
    }
}
