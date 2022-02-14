package methods;

public class HCF {

    static int highestFactor(int number1, int number2){
        int[] fact_of_1 = factors.fact(number1);
        int[] fact_of_2 = factors.fact(number2);

        int limit = number2;

        if (number1 <= number2){
            limit = number1;
        }
        int max = 0;

        for (int i =0; i<= limit; i++){
            for(int j = 0; j<=limit;j++){
                if (fact_of_1[i] == fact_of_2[j] && fact_of_1[i] > max){
                    max = fact_of_1[i];
                }
            }
        }
        if(max == 0){
            return 1;
        }
        else {
            return max;
        }
    }
}
