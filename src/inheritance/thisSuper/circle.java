package inheritance.thisSuper;

public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.pow(this.radius,2) * 3.14;
    }

    public circle() {
    }
}
