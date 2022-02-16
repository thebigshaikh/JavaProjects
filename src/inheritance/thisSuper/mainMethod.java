package inheritance.thisSuper;

public class mainMethod {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(5, 10, 15);
        System.out.println(cyl.area());
        System.out.println(cyl.volume());
//        System.out.println(cyl);

        System.out.println(cyl.getSuperRadius());
        System.out.println(cyl.getCurrRad());
    }
}
