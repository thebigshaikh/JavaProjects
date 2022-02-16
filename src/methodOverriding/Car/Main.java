package methodOverriding.Car;

public class Main {
    public static void main(String[] args) {
        Car ordinary = new Car();
        ordinary.switchOn();
        ordinary.accelerate();
        ordinary.changeGear();

        LuxuryCar luxury = new LuxuryCar();
        luxury.switchOn();
        luxury.accelerate();
        luxury.changeGear();
        luxury.openRoof();

        Car ord = new LuxuryCar();
        ord.changeGear();
        ord.switchOn();


    }
}
