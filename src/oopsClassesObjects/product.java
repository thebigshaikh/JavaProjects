package oopsClassesObjects;

public class product {
    private int itemNumber;
    private String name;
    private double price;
    private int quantity;
    public String test;

    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(this.name == null && this.itemNumber==0){
            System.out.println("Product initialised without any name and number. Hence can't set price");
            return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if(this.name == null && this.itemNumber==0){
            System.out.println("Product initialised without any name and number. Hence can't set quantity");
            return;
        }
        this.quantity = quantity;
    }

    public product(int itemNumber, String name, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public product(double price, int quantity) {
        if(name == null  && this.itemNumber == 0) {
            System.out.println("Product initialised without any name and number. Hence can't set price and quantity");
        }
        else {
            setPrice(price);
            setQuantity(quantity);
        }
    }

    public product(String name, int itemNumber){
        this.name = name;
        this.itemNumber = itemNumber;
        this.price = 0;
        this.quantity = 0;
    }

    public product(){
        System.out.println("Please initialise the object with name and number at least");
        System.out.println(test);
    }
}
