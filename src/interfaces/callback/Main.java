package interfaces.callback;

public class Main {
    public static void main(String[] args) {
        Store walmart = new Store();

        Customers basil = new Customers("Basil Shaikh");
        Customers Jo = new Customers("Jo");
        walmart.register(basil);
        walmart.register(Jo);

        Customers some = new Customers("some");


//        basil.callback();
        walmart.invite();

    }
}
