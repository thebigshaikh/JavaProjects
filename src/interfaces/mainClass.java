package interfaces;

public class mainClass {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone(123, "GSMA", "13 Pro");
        iphone.setPrice(1000);
        iphone.smartPhoneDesc();
        System.out.println("Current Object  is" + iphone.getClass().getName());
        iphone.click();
        iphone.call();
        iphone.playMusic();
        iphone.record();
        iphone.playVideo();
        iphone.message();
        System.out.println(iphone.getImei());
        System.out.println(iphone.getMode());

        System.out.println(" _______________________________________________");

        Phone generalPhone = iphone;
        System.out.println("Current Object Reference is" + generalPhone.getClass().getName());
        generalPhone.call();
        generalPhone.message();
        System.out.println(generalPhone.getImei());
        System.out.println(generalPhone.getMode());

        System.out.println(" _______________________________________________");

        Icamera iphoneAsCamera = iphone;
        System.out.println("Current Object Reference is" + iphoneAsCamera.getClass().getName());
        iphoneAsCamera.click();
        iphoneAsCamera.record();

        System.out.println(" _______________________________________________");
        IMusicPlayer iphoneAsMusicPlayer = iphone;
        System.out.println("Current Object Reference is" + iphoneAsMusicPlayer.getClass().getName());
        iphoneAsMusicPlayer.playMusic();
        iphoneAsMusicPlayer.playVideo();

        System.out.println(" _______________________________________________");
        Phone ordinary = new Phone(456,"CDMA");
        ordinary.message();
        ordinary.call();
        System.out.println(ordinary.getImei());
        System.out.println(ordinary.getMode());

        System.out.println(" _______________________________________________");
        HandCam hc = new HandCam();
        hc.click();
        hc.record();
        hc.record4k();

        System.out.println(" _______________________________________________");
        Icamera cam = new HandCam();
        cam.record4k();
        cam.click();
        cam.record();


    }
}
