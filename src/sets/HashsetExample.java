package sets;
import java.util.HashSet;
public class HashsetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(6);

        System.out.println(set);

        System.out.println(set.contains(7));

        System.out.println(set.contains(10));

        set.remove(7);
        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
    }
}
