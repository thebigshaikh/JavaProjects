package singleton;

public class CoffeeMachine {
    private  static int milkQuant = 30;
    private  static int coffeeQuant= 20;
    static CoffeeMachine inst = null;

    public void makeCoffee(){
        System.out.println("Made coffee by mixing "+milkQuant+ " with "+ coffeeQuant);
        System.out.println("Here is your coffee " + inst);
    }

    private CoffeeMachine(){

    }

    static CoffeeMachine getInstance(){
        if(inst == null){
            inst =  new CoffeeMachine();
        }
        return inst;
    }
}
