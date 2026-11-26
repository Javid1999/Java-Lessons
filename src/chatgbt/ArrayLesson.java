package chatgbt;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLesson {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(
                        15, 72, 4, 39, 81, 22, 60
                ));
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}