// Ellipse.java
public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(String name, double a, double b) {
        super(name);
        // Ensure a is always the major axis
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    // Override abstract methods
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        // Approximation for the perimeter of an ellipse
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}