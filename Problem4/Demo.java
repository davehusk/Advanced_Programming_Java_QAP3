// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = {
            new Circle("Circle", 5.0),
            new Ellipse("Ellipse", 6.0, 4.0),
            new Triangle("Triangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("Equilateral Triangle", 6.0)
        };

        // Print details before scaling
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        for (Scalable shape : shapes) {
            shape.scale(2.0);
        }

        // Print details after scaling
        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }
}