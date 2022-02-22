package interfaces;

public class Phone {
    private int imei;
    private String mode;

    public Phone(int imei, String mode){
        this.imei = imei;
        this.mode = mode;
    }

    public int getImei(){
        return this.imei;
    }

    public String getMode(){
        return this.mode;
    }

    public void call(){
        System.out.println("Calling from Phone");
    }

    public void message(){
        System.out.println("Messaging from Phone");
    }


}
