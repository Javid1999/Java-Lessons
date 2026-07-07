
    public class dynamicArray {
        public static void main(String[] args) {

            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = new int[10];

            System.arraycopy(array1, 0, array2, 3, array1.length);

            for (int value : array2) {
                System.out.print(value + " ");
            }
        }
    }
