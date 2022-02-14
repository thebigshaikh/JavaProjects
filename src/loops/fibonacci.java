package loops;

import java.util.Arrays;

public class fibonacci {

    public static int[] fibo(){
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2 ; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
        return fib;
    }

    public static int fib_rec(int n){
//        int[] fib = new int[10];

        if(n == 0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        return fib_rec(n-1) + fib_rec(n-2);

    }

    public static void main(String[] args) {
        int[] fib_ser = fibo();
        System.out.println(Arrays.toString(fib_ser));

        for (int i = 0; i < 10 ; i ++ ){
            System.out.println(fib_rec(i));
        }
    }
}
