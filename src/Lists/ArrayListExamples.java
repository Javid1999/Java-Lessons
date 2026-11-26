package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        list.ensureCapacity(20);

        boolean empty = list.isEmpty();
        System.out.println(empty);
        System.out.println("*******************************");

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        System.out.println("*******************************");

        List<Integer> list1  = Arrays.asList(9,10,11,12);
        list.addAll(8,list1);
        System.out.println(list);
        System.out.println("*******************************");

        //list.removeLast();
        System.out.println(list);
        System.out.println("*******************************");

        list.remove(Integer.valueOf(9));
        System.out.println(list);

        System.out.println(list.size());
        System.out.println("*******************************");


        list.trimToSize();


        list.add(2,10);
        System.out.println(list);
        System.out.println("*************");

        int first = list.indexOf(10);
        System.out.println(first);
        System.out.println("*************");

        int last = list.lastIndexOf(10);
        System.out.println(last);
        System.out.println("*************");

        Integer max = Collections.max(list);
        System.out.println(max);
    }
}
