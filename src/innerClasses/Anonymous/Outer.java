package innerClasses.Anonymous;

public class Outer{

    Outer(){
        System.out.println("In outer class constructor");
    }
//    Anonymous Class
    abstractClass abs = new abstractClass() {
        @Override
        void overrideThis() {
            System.out.println("Anonymous class overriding abstract class method");
        }

        @Override
        void overrideThis2(){
            System.out.println("Anonymous class overriding abstract class method-2");

        }
    };

    public void display(){
        System.out.println("In Outer");
    }
}
