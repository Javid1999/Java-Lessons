package sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
         TreeSet<Integer> set = new TreeSet<>();

         set.add(5);
         set.add(2);
         set.add(7);
         set.add(1);
         set.add(8);

        System.out.println(set);

        System.out.println(set.contains(1));

        set.remove(5);

        System.out.println(set);

        System.out.println(set.first());

        System.out.println(set.last());

        System.out.println(set.lower(7));

        System.out.println(set.higher(7));
        System.out.println(set.floor(7));

        System.out.println(set.ceiling(7));

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());

        System.out.println(set);


    }
}
