package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.Circle;
import ro.scoalainformala.shapes.domain.Rectangle;
import ro.scoalainformala.shapes.domain.Square;
import ro.scoalainformala.shapes.domain.Triangle;

public class ShapeProgram {

    public static void main(String[] args) {

        Square sq = new Square(5);
        sq.setSide(-8);
        int side = sq.getSide();

        System.out.println("Which are the area and the perimeter of this square?" + "\nThe value of side is: " + side + "\nThe perimeter is: " + sq.calculatePerimeter() + " and the area is: " + sq.calculateArea());
        System.out.println();

        Triangle t = new Triangle(8, 11, 13);

        System.out.println("Which are the area and the perimeter of this triangle?" + "\nThe perimeter is: " + t.calculatePerimeter() + ", and the area is: " + t.calculateArea());
        System.out.println();

        Circle c = new Circle(4.3);

        System.out.println("Which are the area and the perimeter of this circle?" + "\nThe perimeter is: " + c.calculatePerimeter() + ", and the area is: " + c.calculateArea());
        System.out.println();

        Rectangle rec = new Rectangle(4, 5);

        System.out.println("Which are the area and the perimeter of this rectangle?" + "\nThe perimeter is: " + rec.calculatePerimeter() + ", and the area is: " + rec.calculateArea());
    }
}
