package inheritance.thisSuper;

public class cylinder extends circle{
    private double radius;
    private double height;

    public cylinder(double radius, double height, double rad) {
        super(radius);
        this.height = height;
        this.radius = rad;
    }

    public double volume(){
        return  super.area() * this.height;
    }

//    @Override
    public double getSuperRadius() {
        return super.getRadius();
    }

    public double getCurrRad(){
        return this.radius;
    }
}
