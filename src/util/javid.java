package util;

public class javid {
    public static void main(String[] args) {
         int a = 35;
         int b = 45;
         int d =55;
       //  int max ;//


        // int max = a>b ? a :b;
        int max = a > b ? a : (b > d ? b : d);
        System.out.println("Max of numbers: " +max);    }
}
