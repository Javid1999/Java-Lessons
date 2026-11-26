package patterns_matching;

public class Main {
    public static void main(String[] args) {
      print(2);
    }
    public static void print (Object object) {
        if (object instanceof String str) {
            System.out.println(str.toUpperCase());
        } else if (object instanceof Integer number){
            System.out.println(number*2);
        }
        else {
            System.out.println("error");
        }
    }
}
