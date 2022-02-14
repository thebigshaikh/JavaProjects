package loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_num = num;
        int count = 0;
        int amstrong = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            arr.add(rem);
            count += 1;
        }
        System.out.println(arr.toString());

        ArrayList<Integer> orig_arr = new ArrayList<>(arr);
        Collections.reverse(orig_arr);

        if (orig_arr.equals(arr) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

