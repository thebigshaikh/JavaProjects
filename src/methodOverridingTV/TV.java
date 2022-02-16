package methodOverridingTV;

public class TV {

    private int size;
    private int resolution;

    public void switchOn(){
        System.out.println("TV is on");
    }

    public void changeChannel(){
        System.out.println("Channel changed");
    }
}
