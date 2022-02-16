package methodOverriding.Car;

public class LuxuryCar extends Car{

    @Override
    public void changeGear(){
        System.out.println("Luxury car gear changed");
    }

    public void openRoof(){
        System.out.println("Roof opened");
    }
}
