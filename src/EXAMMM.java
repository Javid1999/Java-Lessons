import com.sun.jdi.PathSearchingVirtualMachine;

public class EXAMMM {
    public static void main(String[] args) {
        exam7();
    }

    static void exam1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
            }
        }

        System.out.println(sum);

    }

    static void exam2() {
        int[] array = {1, 2, 3, 23, 45, 12, 56, 234, 121};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    static void exam3() {
        String text = "Galatasaray";
        String reverse_text = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse_text += text.charAt(i);

        }
        System.out.println(reverse_text);
    }

    static void exam4() {
        int[] array = {1, 2, 2, 2, 4, 5, 6, 6, 6, 6, 6, 8};
        int max =0;
        int maxNum =0;
        for (int i = 0; i < array.length; i++) {
            int count =0;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                }
            }
            if(count>max){
                max =count;
                maxNum = array[i];
            }
        }
        System.out.println("en cox tekrarlanan reqem:"+maxNum);
        System.out.println("tekrarlanma sayi:"+max);
    }
    static void exam7()  {
        String text = "hello";

        for (int i = 0; i <= text.length()-1 ;i++) {
            char current = text.charAt(i);
            boolean checked = false;
            int count =0;
            for (int j = 0 ; j <= text.length()-1;j++){

                if(text.charAt(i)==text.charAt(j)){
                    count ++;

                }

            }

            System.out.println(text.charAt(i)+" -> "+count);

        }
    }
}
