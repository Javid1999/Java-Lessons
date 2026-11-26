package sets;

import java.util.LinkedHashSet;

public class LHsetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(5);
        set.add(4);
        set.add(3);
        set.add(7);
        set.add(11);
        set.add(9);
        set.add(1);
        System.out.println(set);

        System.out.println(set.contains(7));

        System.out.println(set.contains(22));

        set.remove(4);
        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
    }
}
