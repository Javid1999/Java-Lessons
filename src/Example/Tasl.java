package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class Tasl {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

//        for (Integer number : numbers) {
//            System.out.println(number);
//        }


        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(15);
        number1.add(25);
        number1.add(35);
        number1.add(45);
        number1.add(55);

//        System.out.println(number1.get(0));
//        System.out.println(number1.get(3));
//        System.out.println(number1.size());

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Cavid");

//        names.set(1, "ELvin");
//        for (String name : names) {
//            System.out.println(name);
//        }

        ArrayList<Integer> number2 = new ArrayList<>();

        number2.add(10);
        number2.add(20);
        number2.add(30);
        number2.add(40);
        number2.add(50);

        number2.remove(2);

//        for (Integer number : number2) {
//            System.out.println(number);
//        }

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Baku");
        names1.add("Ganja");
        names1.add("Sumqayit");
        names1.add("Shaki");
//
//        System.out.println(names1.contains("Baku"));
//        System.out.println(names1.contains("Lankaran"));


        ArrayList<Integer> number3 = new ArrayList<>();

        number3.add(12);
        number3.add(7);
        number3.add(20);
        number3.add(15);
        number3.add(8);
        number3.add(3);
        number3.add(10);

//       for ( int i=0; i<number3.size(); i++ ) {
//
//
//           if(number3.get(i) % 2 ==0) {
//               System.out.println(number3.get(i));
//           }
//       }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for ( int i=0; i<number3.size(); i++ ) {


            if(number3.get(i) % 2 ==0) {
               evenNumbers.add(number3.get(i));
            }
        }
//        System.out.println(evenNumbers);

        ArrayList<Integer> number5 = new ArrayList<>();

        number5.add(45);
        number5.add(12);
        number5.add(78);
        number5.add(3);
        number5.add(56);
        number5.add(91);
        number5.add(24);
        int max = number5.get(0);
        for  ( int i=0; i<number5.size(); i++ ) {
             if (number5.get(i) > max){
                 max = number5.get(i);
             }
        }
     //   System.out.println(max);

        ArrayList<Integer> number8 = new ArrayList<>();

        number8.add(10);
        number8.add(20);
        number8.add(10);
        number8.add(30);
        number8.add(20);
        number8.add(40);
        number8.add(50);
        number8.add(30);
        for (int i = 0; i < number8.size(); i++ ) {
            for  (int j = i+1; j < number8.size(); j++ ) {
                if (number8.get(i).equals(number8.get(j))) {
                    System.out.println(number8.get(i));
                    break;
                }
            }
        }
    }
}