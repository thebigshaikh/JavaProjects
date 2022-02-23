package staticFinal;

public class main {
    int x = 1;

    public static void main(String[] args) {
        HondaCity car1 = new HondaCity("Red", "Petrol");
        car1.driveCar();
        System.out.println(HondaCity.priceByCity("Mumbai"));
        System.out.println(car1.priceByCity("Delhi"));
        HondaCity.priceByCity("Pune");
    }
}
