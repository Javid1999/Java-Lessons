import java.util.Scanner;

public class Switchst {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        String size = switch (num) {
            case 18 -> "Balaca";
            case 30 -> "Orta";
            default -> "Nope";

        };

        System.out.println("Size: " + size);

        sc.close();
    }
}
