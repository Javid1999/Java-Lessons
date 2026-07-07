import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Text-i elave edin:");
        String text =  sc.nextLine();
        int first = 0;
        int last = text.length() -1;
        boolean palindrom = true;
        while (first < last) {
            if (text.charAt(first) != text.charAt(last)) {
                palindrom = false;
                break;
            }
            first++;
            last--;
        }
        if (palindrom) {
            System.out.println(text+"-Palindrom Sozdur!");
        }
        else {
            System.out.println(text+"None-Palindrom Sozdur!");
        }
        sc.close();
    }
}

