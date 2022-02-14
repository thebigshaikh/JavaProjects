package methods;

public class factors {

    public static int[] fact(int number){
        int[] facts = new int[number+1];

        for(int i = 2; i<=number; i++){
            if( number%i == 0){
                facts[i] = i;
            }
        }
        return facts;
    }

}
