package oopsClassesObjects;

public class circle {

    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area(){
        double radi = this.radius;
        double area =  3.14 * Math.pow(radi,2);
        return area;
    }

    public double circumfurence(){
        return 2 * 3.14 * this.radius;
    }
}
