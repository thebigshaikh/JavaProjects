package innerClasses.nestedClasses;

public class Outer {
    int x = 10;

    public void display(){
        System.out.println("In outer-class");
    }

    public class Inner{
        public void display(){
            System.out.println("In inner-class");
            System.out.println("Value of x is " +x);
        }

        public int y = 20;
    }

    public void useInner(){
        Inner in = new Inner();
        in.display();
        System.out.println(in.y);
    }
}
