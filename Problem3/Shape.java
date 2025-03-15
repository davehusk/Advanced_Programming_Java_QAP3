// Shape.java
public abstract class Shape {
    protected String name; // Name of the shape

    // Constructor
    public Shape(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // toString method to display Shape details
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    // Additional method to check if the shape is regular
    public abstract boolean isRegular();
}