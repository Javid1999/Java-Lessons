public class  taskArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,7,45,12,0};
        int max = array[0];
        int min = array[0];
        for (int value : array){

           if  (max < value ){
               max = value;
           }
           if (min>value) {
               min = value;

           }

        }
        System.out.println(min+" en kicik ededdir");

        System.out.println(max+" en boyuk ededdir");
    }
}
