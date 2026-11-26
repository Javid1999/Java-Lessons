package generics;

import java.util.Scanner;
public class MaxCopySimvol {
    public static void main(String[] args) {
        System.out.println("Text-i elave edin:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int maxCount = 0;
        char Simvol = ' ';

        for (int i =0; i<text.length();i++) {
            int count = 0;

            for (int j=0;j<text.length();j++){
                if (text.charAt(i)==text.charAt(j)){
                    count++;
                }

                }
            if (count>maxCount){
                maxCount = count;
                Simvol = text.charAt(i);


            }
        }
        System.out.println("En cox tekrarlanan simvol:"+Simvol);
        System.out.println("Tekrar sayi:"+maxCount);
        sc.close();
    }

}

