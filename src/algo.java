import java.util.Scanner;
public class algo {
    public static void main(String[] args) {
        System.out.println("Kart nomresini daxil edin:");

        String card_pan = "5243754429023037";
        int sum = 0;
        for (int i = card_pan.length() - 1; i >= 0; i--) {
            char c = card_pan.charAt(i);
            int number = c - '0';
            if (i % 2 == 0) {
                number *= 2;
                if (number > 9) {
                    number -= 9;
                }
            }
            sum += number;
        }
        if (sum % 10 == 0) {
            System.out.println("kard nomresi duzgundur:" + card_pan);

        } else {
            System.out.println("kard nomresi duzgun deyil:" + card_pan);
        }
    }

    }

