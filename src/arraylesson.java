import java.lang.reflect.Array;
import java.util.Arrays;

public class arraylesson  {
    public static void main(String[] args) {
     exam13() ;
    }
    static void exam1() {
        int [] arr = new int [3];
        System.out.println(arr[0]);
    }

    static void exam2() {
        int [] arr = {3,4,4};
        System.out.println(arr[0]);
    }
    static void exam3() {
        int[] arr = new int [4];
        arr[0] =3;
        arr[1] =3;
        arr[2] =1;
        arr[3] =2;
       // arr[4] =6;
        System.out.println(arr[1]);
    }
    static void exam4() {
        int[] arr = {4, 6, 7, 10, 11, 4};
        for (int value : arr) {
            System.out.println(value);
        }
    }
    static void exam5() {
        int[] arr = {1, 3, 2, 5, 6, 8, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
       static void exam6() {
         int [] arr = {3,5,7,2,3};
           System.out.println(Arrays.toString(arr));
        }
        static void exam7() {
            int[] arr = {1, 3, 2, 11, 3, 55};
            System.out.println(arr.length);
    }
    static void exam8() {
        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {5,4,3,2,1};
        //int firstArrayIndex =1;
        //int secondArrayIndex =2;
        int length =3;
        System.arraycopy(secondArray,1,firstArray,1,length);
        System.out.println(Arrays.toString(firstArray));

    }
    static void exam9 () {
        int[] arr = new int [10];
        int  startIndex =1;
        int  endIndex =4;
        Arrays.fill(arr,startIndex,endIndex,4);
        System.out.println(Arrays.toString(arr));
    }
    static void exam10() {
        int [] arr = {1,2,3,4,2,6,7,8,99,11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void exam11(){
        int [] arr = {1,2,3};
        int [] arr_second ={1,2,3,4};
        boolean isEqual = Arrays.equals(arr,arr_second);
        System.out.println(isEqual);
    }
    static void exam12(){
        int[] arr = {5,4,9,8,2,1,7,6,3,12,47,58,96};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 12);
        System.out.println(index);
    }
    static void exam13() {
        int[] arr = {5,4,6,4,7,8,4,1};
        int[] arr1 = {1,2,3,5,6,11};
        for (int j : arr){
            for (int d :arr1){
                if (j!=d)  System.out.println(d);
            }
        }
    }

        }



