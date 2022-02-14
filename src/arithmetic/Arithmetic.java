package arithmetic;

import java.util.*;
import java.lang.Math;

public class Arithmetic {

    public float areaBySides(float a, float b , float c){
        float s = 0.5f * ( a + b + c);
        System.out.println(s);
        float cal = (s * (s-a) * (s-b) * (s-c));
        System.out.println(cal);
        float area;
        area = (float) Math.sqrt(cal);
        return area;
    }

    public double[] quadraticRoots(float[] nums){
        float a = nums[0];
        float b = nums[1];
        float c = nums[2];

        double disc = Math.sqrt(b*b - 4 * a * c);
        double r1 = (-b + disc) / 2*a;
        double r2 = (-b - disc) / 2*a;
        double[] arr;                   //Initialised
        arr = new double[2] ;           // Instantiated
        arr[0] = r1;
        arr[1] = r2;
        return arr;
    }

    public static void main(String[] args) {
//        float base, height;
//        System.out.println("Enter base of triangle");
//        Scanner sc = new Scanner(System.in);
//        base = sc.nextFloat();
//        System.out.println("Enter height");
//        height = sc.nextFloat();
//        float area = 0.5f * base * height;
//        System.out.println("Area is " + area);

        Arithmetic arth;
        arth = new Arithmetic();
        System.out.println(" Enter a,b and c");
        Scanner sc = new Scanner(System.in);
        float[] numbers = new float[3];
        for (int i = 0; i < 3; i++){
            numbers[i] = sc.nextFloat();
        }
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();


//        float area = arth.areaBySides(a,b,c);
//        System.out.println("Area is" + area);

        double[] roots =  arth.quadraticRoots(numbers);
        for (int i = 0; i < roots.length; i++){
            System.out.printf("Root %d is %f \n", i+1, roots[i]);
            System.out.format("Root {} is {} ", i+1, roots[i]);
        }

    }
}
