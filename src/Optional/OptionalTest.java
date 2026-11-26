package Optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
      test5();
    }

    static void test(){
        Optional<String> name = Optional.of("Vuqar");
        System.out.println(name);
    }
    static void test1(){
        Optional<String> name = Optional.of(null);
        System.out.println(name);
    }
    static void test2(){
        Optional<String> name = Optional.ofNullable("Vuqar");
        System.out.println(name);
    }
    static void test3(){
        String x = null;
        Optional<String>  name = Optional.ofNullable(x);
        System.out.println(name);

    }
    static  void test4(){
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
    }
    static void test5(){
        Optional<String> name = Optional.of("Vuqar");
        System.out.println(name.get());

//        Optional<Object> nullOptional = Optional.ofNullable(null);
//        System.out.println(nullOptional.get());
    }
}

