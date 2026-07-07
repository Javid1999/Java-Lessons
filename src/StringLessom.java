public class StringLessom {
    public static void main(String[] args) {
        exam9();
    }
    static void exam1(){
        String name = "John";
        String surname = new String("John");
        System.out.println(name);
        System.out.println(surname);
    }
    static void exam2() {
        String value = String.valueOf(3434343434l);
        System.out.println(value);
    }
    static void exam3(){
        String name ="John";
        char c  = name.charAt(2);
        System.out.println(c);
    }
    static void exam4() {
        String firstName = "John";
        String lastName = "Snow";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(firstName.concat(" "+ lastName));
        System.out.println(firstName + " " + lastName);
    }
    static void exam5() {
        String test = "Java";
        boolean isContain = test.contains("ava");
        System.out.println(isContain);
    }
    static void exam6() {
        String str ="Mauro Emanuel Icardi";
        boolean isStarted = str.startsWith("Mauro");
        boolean isEnded = str.endsWith("Icardi");
        System.out.println(isStarted);
        System.out.println(isEnded);
    }
    static void exam7() {
        String test = "         test    ";
        System.out.println(test);
        System.out.println(test.trim());
    }
    static void exam8(){
        String test = "Azerbaycan";
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
    }
    static void exam9() {
        String test = "elektriklesdirilmis";
        int index = test.indexOf('l',2);
        System.out.println(index);
        int lastIndex = test.lastIndexOf('l');
        System.out.println(lastIndex);
    }

}
