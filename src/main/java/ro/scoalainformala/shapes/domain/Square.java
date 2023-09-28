package ro.scoalainformala.shapes.domain;

/**
 * Square
 * ----
 * - characteristics (properties)
 * - 4x sides
 * - behaviors (actions; methods)
 * - calculate Permieter: 4 * side
 * - calculate Area: side * side
 */
public class Square {

    int side;

    public Square(int s) {

        side = s;
    }

    public int getSide() {

        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Wrong number! Please introduce a positive number !");
        }
    }

    public int calculatePerimeter() {

        return 4 * side;
    }

    public int calculateArea() {

        return side * side;
    }
}
