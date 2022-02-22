package interfaces;

public interface Icamera {
    public void click();
    public  void record();

    default void record4k(){
        System.out.println("Ability to record in 4k  but not yet implemented");
    }
}
