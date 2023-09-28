package ro.scoalainformala.shapes.domain;

/**
 * Triangle
 * ----
 * - characteristics (properties)
 * - 3x sides
 * - behaviors (actions; methods)
 * - calculate Permieter: l1 + l2 + l3
 * - calculate semiPerimeter: calculatePerimeter() / 2
 * - calculate Area: Math.sqrt(semiPerimeter() * (semiPerimeter() - l1) * (semiPerimeter() - l2) * (semiPerimeter() - l3))
 */

public class Triangle {
    // proprietatile clasei (variabilele de instanta) - starea obiectului
    double l1;
    double l2;
    double l3;

    // un constructor al clasei
    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    // metodele publice ale clasei reprezinta "interfata" clasei

    // comportamentul obiectelor clasei
    public double calculatePerimeter() {

        return l1 + l2 + l3;
    }

    public double calculateArea() {
        return Math.sqrt(semiPerimeter() * (semiPerimeter() - l1) * (semiPerimeter() - l2) * (semiPerimeter() - l3));
    }

    // metodele private nu fac parte din interfata clasei

    // metoda accesibila doar in interiorul clasei curente
    private double semiPerimeter() {
        return calculatePerimeter() / 2;
    }
}
