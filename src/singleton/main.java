package singleton;

public class main {
    public static void main(String[] args) {
        CoffeeMachine coffee = CoffeeMachine.getInstance();
        coffee.makeCoffee();

        CoffeeMachine coffee2 = CoffeeMachine.getInstance();
        coffee.makeCoffee();
    }
}
