package staticFinal.finalPractice;

public final class A {
    final int a;
    static final int b;
    static int c;

    A(){
        this.a = 10;
//        this.b =20;
    }

    static {
        b =30;
    }
}

//public final class C extends A{
//
//}
