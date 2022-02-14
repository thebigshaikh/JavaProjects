package loops;

import java.util.Scanner;
import java.util.stream.Collectors;

public class arithmeticProgression {
    public static void main(String[] args) {
        System.out.println("Enter number and progression");
        int[] arr = new int[2];

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ");
        String str = sc.nextLine();
        System.out.println(str);

        String[] str_arr = str.split(" ");

        for (int i = 0; i < arr.length; i++){
            System.out.println(str_arr[i]);
            System.out.println(Integer.parseInt(str_arr[i]));
            arr[i] = Integer.parseInt(str_arr[i]);
        }

        int num = arr[0];
        int prog = arr[1];
        int sum = num;
        int[] ap = new int[10];
        for (int i = 0; i< ap.length; i++){
            ap[i] = sum;
            sum = sum + prog;
            System.out.println(ap[i]);
        }
    }
}
