import java.util.Arrays;
public class arrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,8};//,2,1,5,7,8,9,11,14,15,13,46,66,43,57};
         int left =0;
         int right = array.length-1;
         while (left < right) {
             int temp = array[left];
             array[left] = array[right];
             array [right]=temp;
             left++;
             right--;


         }
        System.out.println(Arrays.toString(array));

    }
}
