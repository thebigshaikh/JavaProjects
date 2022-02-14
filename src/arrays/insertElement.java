package arrays;

import java.util.Arrays;

public class insertElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0 ; i <= 5; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int index = 2;
        int number = 99;

        for (int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        System.out.println(Arrays.toString(arr));

    }
}
