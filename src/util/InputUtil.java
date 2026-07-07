package util;

import java.util.Scanner;

public class InputUtil {
    public static int  reqemitelebet (String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextInt();
    }
    public static String  Stringitelebet (String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextLine();
    }
   public   static char simvoludaxilet(String mesaj){
        System.out.println(mesaj);
        return new Scanner(System.in).next().charAt(0);
    }
}
