package arrays;

import java.util.Arrays;

public class twoDimensional {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        for(int i =0; i < arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j] = i+j;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
