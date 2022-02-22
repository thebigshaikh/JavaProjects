package innerClasses.localClass;

public class Outer {
    public void display(){
        System.out.println("In outer class");
    }
    int y =30;
    public void definesInnerClass(){
        int x = 10;
        class local_inner {
            int z  = 20;
            void display(){
                System.out.println("In local inner class");
                System.out.println(x);
                System.out.println(this.z);
            }
        }
        local_inner localin = new local_inner();
        localin.display();
    }
}
