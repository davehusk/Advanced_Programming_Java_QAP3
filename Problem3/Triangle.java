// Triangle.java
public class Triangle extends Shape {
    private double side1, side2, side3; // Sides of the triangle

    // Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        // Check if the sides form a valid triangle
        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Error: Invalid triangle sides.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Helper method to check if sides form a valid triangle
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    // Override abstract methods
    @Override
    public double getArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}