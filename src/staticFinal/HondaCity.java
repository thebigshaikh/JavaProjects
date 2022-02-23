package staticFinal;

public class HondaCity {
    static int price = 1000;
    String colour;
    String fuel;

    HondaCity(String colour, String fuel){
        this.colour  = colour;
        this.fuel = fuel;
    }

    void driveCar(){
        System.out.println("Driving "+colour+ " Honda City on "+fuel+" costing "+price);
    }

    public static double priceByCity(String city){
        switch (city){
            case "Mumbai":
                return price + price * 0.1;

            case "Delhi":
                return price + price * 0.2;

            default:
                System.out.println(" Not available in your city");
                return 0;
        }
    }
}
