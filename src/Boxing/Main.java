package Boxing;

public class Main {
    public static void main(String[] args) {
        Box<String> phone = new Box<>("Iphone");
        Box<Integer> money = new Box<>(100);
        System.out.println(phone.getItem());
        System.out.println(money.getItem());
    }
}