package variableArgsMethods;

public class var_args {

    public static double discount(double discount, int ...prices){
        double d;
        double sum = 0.0;
        for (int price : prices) {
            sum += price;
        }
        d = (discount/100) * sum;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(discount(10,20,30,40,50,60,70));

    }
}
