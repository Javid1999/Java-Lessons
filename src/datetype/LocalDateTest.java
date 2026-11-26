package datetype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
      //System.out.println(LocalDateTime.now());
       // minusPeriod();
     //   format();
        //parse();
      //  System.out.println(test("04/04/2024"));
        defaultParse();
    }
//    public static void minusPeriod(){
//        LocalDate a = LocalDate.of(2014,1,12);
//        //LocalDate c = LocalDate.of(2047, 1, 7);
//        LocalDate b = a.minus(Period.ofDays(5));
//        System.out.println(a);
//        System.out.println(b);
//    }
//    public static void format() {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println(formatter.format(date));
//    }
    public static void parce() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String date ="16/08/2016";
        System.out.println(formatter);
        LocalDate localDate = LocalDate.parse(date,formatter);
        System.out.println(localDate);
    }
    public static void defaultParse(){
        String date = "2061-08-16";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
    }

    public static String test(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localdate = LocalDate.parse(date, formatter);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
         return formatter1.format(localdate);
    }

}
