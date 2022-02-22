package abstractClasses;

public class mainMethod {
    public static void main(String[] args) {
        shape circle = new circle(10);
        circle.name();
        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        System.out.println("_______________________________");

        shape rect = new rectangle(10,20);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        System.out.println("_______________________________");

        circle circle1 = new circle(10);
        circle1.name();
        circle1.name1();
        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());
        System.out.println("_______________________________");

        circle1.setRadius(20);
        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());


    }
}
