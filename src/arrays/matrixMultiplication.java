package arrays;

import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1},{4},{7}};
        int[][] matrix2 = new int[][]{{5,5,5}};
        int[][] result = new int[matrix1.length][matrix2[0].length];

            for(int i  = 0; i < matrix1.length; i++){
                for (int j = 0; j< matrix2[0].length; j++){
                    result[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length ; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

        System.out.println(Arrays.deepToString(result));
    }
}
