package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
//        MathOperation multiplication = (a,b) -> a*b;
//        MathOperation sum = Integer ::sum;
//
//        int a =5;
//        int b =12;
//
//        System.out.println(multiplication.operate(a,b));
//
//        System.out.println(sum.operate(a,b));

//        Greeting greeting =() -> System.out.println("I love ABB");
//        greeting.SayHello();
//        Printer printer = text -> System.out.println(text);
//        printer.print("Hello");
//
//        Printer print = System.out::println;
//        print.print("Hello");
//
//        Calculat  calculat = (a,b) -> a*b;
//        System.out.println(calculat.calculate(10,20));
//        Message message = text -> System.out.println(text);
//        message.Show("Hello");
//        Square square = number -> number * number;
//        System.out.println(square.calculate(10));
        Calculat calculat = (a,b) -> {
            int sum = a + b;
            return sum;
        };
        System.out.println(calculat.calculate(5,2));

    }
}
