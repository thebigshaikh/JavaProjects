package abstractClasses;

public abstract class shape {

    abstract double area();
    abstract double perimeter();

    public void name(){
        System.out.println("Hello from shape class");
    }
}
