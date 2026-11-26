package wrappertype;

import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 4},
                {6, 8},
                {10, 12}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 6) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
