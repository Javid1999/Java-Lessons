package generics;

public class algoritmPan {
    public static void main(String[] args) {
        String card_pan = "5243754429023037";
        int sum =0;
      //  int number =0;
        boolean check = false;
        for (int i =card_pan.length()-1;i>=0;i--) {
            char c = card_pan.charAt(i);
            int  number = c - '0';
            if (check) {
                number *= 2;
                if (number >9) {
                    number -=9;
                }
            }
            sum += number;
            check = !check;
        }
        if (sum%10==0) {
            System.out.println("kard nomresi duzgundur:"+card_pan);
        }
        else  {
            System.out.println("kard nomresi duzgun deyil:"+card_pan);
         }
    }
}
