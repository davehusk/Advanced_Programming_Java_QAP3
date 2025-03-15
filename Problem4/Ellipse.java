// Ellipse.java
public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(String name, double a, double b) {
        super(name); // Call superclass constructor
        setAxes(a, b); // Validate and set axes
    }

    // Method to set axes with validation
    public void setAxes(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Axes cannot be negative.");
        }
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
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }

    // Override isRegular method (an ellipse is regular only if it's a circle)
    @Override
    public boolean isRegular() {
        return a == b;
    }

    // Additional method to calculate aspect ratio
    public double getAspectRatio() {
        return a / b;
    }

    // Implement Scalable interface
    @Override
    public void scale(double factor) {
        if (factor < 0) {
            throw new IllegalArgumentException("Scaling factor cannot be negative.");
        }
        a *= factor;
        b *= factor;
    }
}