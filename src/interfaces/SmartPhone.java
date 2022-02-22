package interfaces;

public class SmartPhone extends Phone implements Icamera, IMusicPlayer{

    private String modelName;
    private int price ;

    public SmartPhone(int imei, String mode, String modelName){
        super(imei, mode);
        this.modelName = modelName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void smartPhoneDesc(){
        System.out.println("Model Name is" + this.modelName);
        System.out.println("Price is" + this.price);
    }

    @Override
    public void call(){
        System.out.println("Calling on smartphone using VOIP");
    }

    public void playMusic(){
        System.out.println("Playing music on SP");
    }

    public void playVideo(){
        System.out.println("Playing video on SP");
    }

    public void click(){
        System.out.println("Clicking on SP");

    }
    public void record(){
        System.out.println("Recording on SP");
    }

    public void record4k(){
            System.out.println("Recording on 4K because it is implemented for smartphones");
    }


}
