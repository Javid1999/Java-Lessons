package sets;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Weekday> weekdays = EnumSet.allOf(Weekday.class);
        System.out.println(weekdays);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        System.out.println(never);
        EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        System.out.println(workday);
        workday.add(Weekday.SUNDAY);
        workday.remove(Weekday.MONDAY);
        System.out.println(workday);
    }
}
