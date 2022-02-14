package arrays;

import java.util.Arrays;

public class deleteElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int ind = 4;
        int num = 0;

        for (int i = ind; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }

}
