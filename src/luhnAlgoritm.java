public class luhnAlgoritm {
    public static void main(String[] args) {
        String card_no = "5243754429023037";
         int sum =0;
         boolean check= false;

        for (int i = card_no.length()-1 ; i >= 0; i--) {
            char c = card_no.charAt(i);
            int number = c - '0';
            if (check) {
                number *= 2;
                if (number > 9) {
                    number -= 9;
                }
            }

            sum += number;

            check = !check;
        }
        if (sum%10 == 0) {
            System.out.println("kard dogrudur:"+card_no);
        }
        else {
            System.out.println("kard yanlisdir:"+card_no);
        }
    }
}