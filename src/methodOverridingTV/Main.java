package methodOverridingTV;

public class Main {
    public static void main(String[] args) {
        TV crt = new TV();
        crt.switchOn();
        crt.changeChannel();

        System.out.println("________________________________________________");

        SmartTV led = new SmartTV();
        led.switchOn();
        led.changeChannel();
        led.watchYoutube();

        System.out.println("________________________________________________");

        TV smart = new SmartTV();
        smart.switchOn();
        smart.changeChannel();
    }
}
