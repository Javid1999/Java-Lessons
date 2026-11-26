package Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println( reverse("CEYHUN"));
     }
//    private static int factorial (int n){
//        if ( n == 0 || n == 1) {
//            return 1;
//        }
//    return factorial(n-1) *n;
//    }
//    private static void countDown (int n ) {
//        if (n ==0) {
//            return;
//        }
//        countDown(n-1);
//        System.out.println(n);
//
//    }

    public static int fibonacci(int n){

      if (n<=1){
          return n;
      }
      return fibonacci(n-1)+fibonacci(n-2);
    }

    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
