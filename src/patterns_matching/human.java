package patterns_matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class human {
    public static void main(String[] args) {
        groupByHumanSurname();
    }
    static void  groupByHumanSurname() {
        List<human14> humans = asList(
                new human14("X","Aliyev",1),
                new human14("X","Alizade",6),
                new human14("Y","Alizade",4),
                new human14("X","Mamedov",1),
                new human14("Y","Mamedov",3),
                new human14("Y","Aliyev",2),
                new human14("Z","Aliyev",1)

);

        Map<String, List<human14>> map = new HashMap<>();

        for (human14 human : humans) {
            String surname = human.getSurname();
            if (!map.containsKey(surname)) {
                List<human14> list = new ArrayList<>();
                list.add(human);
                map.put(surname, list);
            }
            else {
               List<human14> list = map.get(surname);
                list.add(human);
            }
        }
        System.out.println(map);
    }
}
