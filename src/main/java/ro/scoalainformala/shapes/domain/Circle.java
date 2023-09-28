package ro.scoalainformala.shapes.domain;

/**
 * Circle
 * ------
 * - characteristics (properties)
 * - radius
 * - behaviors (actions; methods)
 * - calculate area: (2 * 3.14) * r
 * - calculateArea: (2 * 3.14) * r * r
 */
public class Circle {
    double radius;

    public Circle(double r) {

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }else {
            System.out.println("Please introduce a positive number!");
        }
    }

    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }

    public double calculateArea() {

        return Math.PI * radius * radius;
    }
}
