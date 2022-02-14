package arrays;

import java.util.Arrays;

public class arrayRotation {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = arr.clone();
        int first = arr[0];
        int arrlen = arr.length;
        int last = arr2[arrlen-1];

        for ( int i = 0; i < arrlen-1;i++){
            arr[i] = arr[i+1];
        }

        for( int i = arrlen-1; i > 0; i--){
            arr2[i] = arr2[i-1];
        }
        arr[arrlen-1] = first;
        arr2[0] = last;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }



}
