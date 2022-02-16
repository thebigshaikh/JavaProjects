package methodOverridingTV;

public class SmartTV extends TV{

    @Override
    public void changeChannel(){
        System.out.println("Smart TV channel changed");
    }

    public void watchYoutube(){
        System.out.println("Watching youtube on STV");
    }
}
