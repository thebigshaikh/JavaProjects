package innerClasses.nestedClasses;

public class main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.display();
        out.useInner();

        Outer.Inner out_in = new Outer().new Inner();
        out_in.display();
        System.out.println(out_in.y);
    }
}
