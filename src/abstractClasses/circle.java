package abstractClasses;

public class circle extends shape{

    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//        public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
    public circle(double radius) {
        this.radius = radius;
    }

    public void name1(){
        System.out.println("Hello from circle");
    }



    public double area(){
        return Math.pow(this.radius,2) * 3.14;
    }

    public double perimeter() {
        return 2 * 3.14 * this.radius;
    }
}

