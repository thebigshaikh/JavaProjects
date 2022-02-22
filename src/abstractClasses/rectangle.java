package abstractClasses;

public class rectangle extends shape {
    private double length;
    private double breadth;

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return this.length * this.breadth;
    }

    public double perimeter(){
        return (2* this.length) + (2*this.breadth);
    }
}
