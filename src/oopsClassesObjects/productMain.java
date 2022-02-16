package oopsClassesObjects;

public class productMain {
    public static void main(String[] args) {
        product product1 = new product();
        product1.setQuantity(10);
        System.out.println(product1.getPrice());
        System.out.println(product1.getItemNumber());

        product product2 = new product(10.00, 1);
    }
}
