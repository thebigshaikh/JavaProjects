package methodOverriding.Car;

public class Car {
    private int wheels = 4;
    private int seats;

    public void switchOn(){
        System.out.println(" Car is on");
    }

    public void accelerate(){
        System.out.println("Accelerating car");
    }

    public void changeGear(){
        System.out.println("Gear changed");
    }

}
