import java.util.Scanner;

public class ExamMay {
    public static void main(String[] args) {
        exam4();
    }

    static void exam1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
            }

        }
        System.out.println(sum);
    }

    static void exam2() {
        int[] array = {1, 12, 23, 46, 55};
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }

    static void exam3() {
        String text = "hello";
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println(reverse);

    }

    static void exam4() {
        int[] array = {1, 2, 3, 2, 5, 1};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    static void exam5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Text-i elave edin:");
        String text = sc.nextLine();
        int first = 0;
        int last = text.length() - 1;
        boolean palindrom = true;
        while (first < last) {
            if (text.charAt(first) != text.charAt(last)) {
                palindrom = false;
                break;
            }
            first++;
            last--;
        }
        if (palindrom) {
            System.out.println(text + "-Palindrom Sozdur!");
        } else {
            System.out.println(text + "None-Palindrom Sozdur!");
        }
        sc.close();

    }

    static void exam6() {
        String text = "Java is very easy";
        int count = 0;
        String[] strings = text.split(" ");
        for (String s : strings) {
            count++;
        }
        System.out.println(count);

    }

    static void exam8() {
        int[] array = {5, 2, 4, 5, 1};
        int max = 0;
        for (int i = 0; i < array.length-1; i++) {
            int count = 0;
            for (int j = 0; j < array.length-1; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
    static void exam10(){
        String text ="Java is very powerful language";
        String[] strings = text.split(" ");
        int max = 0;
        String value = " ";
        for (String s : strings) {
            if (s.length() > max) {
                max = s.length();
                value =s;

       }

        }

        System.out.println(value);


    }
    static void exam7() {
        String text = "hello";
        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }
            System.out.println(text.charAt(i)+" -> " +count);

        }
    }
    static void exam9() {
        int[] array = {1,2,3,5,6};
        int max =21;
        int sum =0;
        int ferq=0;
        for (int i = 0;i<array.length;i++){
            sum+=array[i];
        }
         ferq=max-sum;
        System.out.println(ferq);

    }
}

