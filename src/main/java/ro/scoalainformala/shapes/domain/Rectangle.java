package ro.scoalainformala.shapes.domain;

/**
 * Rectangle
 * ----
 * - characteristics (properties)
 * - length
 * - width
 * - behaviors (actions; methods)
 * - calculate Permieter: (2 * length) + (2 * width)
 * - calculate Area: length * width
 */
public class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int calculatePerimeter() {

        return (2 * length) + (2 * width);
    }

    public int calculateArea() {

        return length * width;
    }
}
