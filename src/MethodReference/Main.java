package MethodReference;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<Integer,Integer> f = MathUtil::square;
//        System.out.println(f.apply(10));
//
        Message m = System.out::println;
        Message t = String ::toUpperCase;
    }
}
