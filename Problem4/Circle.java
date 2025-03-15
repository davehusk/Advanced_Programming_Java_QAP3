// Circle.java
public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor
    public Circle(String name, double radius) {
        super(name); // Call superclass constructor
        setRadius(radius); // Validate and set radius
    }

    // Getter and Setter methods with input validation
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    // Override abstract methods
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override isRegular method (a circle is always regular)
    @Override
    public boolean isRegular() {
        return true;
    }

    // Implement Scalable interface
    @Override
    public void scale(double factor) {
        if (factor < 0) {
            throw new IllegalArgumentException("Scaling factor cannot be negative.");
        }
        radius *= factor;
    }
}