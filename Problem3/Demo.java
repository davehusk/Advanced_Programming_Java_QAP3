// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = {
            new Circle("Circle", 5.0),
            new Ellipse("Ellipse", 6.0, 4.0),
            new Triangle("Triangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("Equilateral Triangle", 6.0)
        };

        // Print details of each shape
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}