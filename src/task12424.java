public class task12424 {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6};
        int sum =0;
        int val =0;
        int ferq =0;
        for ( int i =0;i<array.length+2;i++ ){
            sum=sum+i;
        }
        for (int j=0;j<array.length;j++){
            val+=array[j];
        }
        ferq=sum-val;
        System.out.println(ferq);

    }
}
