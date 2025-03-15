// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create objects
        Point point = new Point(1.0f, 2.0f);
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f, 1.0f, 1.0f);

        // Print initial state
        System.out.println("Point: " + point);
        System.out.println("MovablePoint: " + movablePoint);

        // Move the MovablePoint
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
    }
}