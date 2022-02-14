package arrays;

import java.util.Arrays;

public class increaseSize {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = new int[2 * arr1.length];

        for ( int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
        arr1 = arr2;
        arr2 = null;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }



}
