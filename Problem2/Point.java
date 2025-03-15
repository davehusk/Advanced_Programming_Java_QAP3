// Point.java
public class Point {
    private float x; // x-coordinate
    private float y; // y-coordinate

    // Constructors
    public Point(float x, float y) {
        setX(x); // Validate and set x
        setY(y); // Validate and set y
    }

    public Point() {
        this(0.0f, 0.0f); // Default constructor
    }

    // Getter and Setter methods
    public float getX() { return x; }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() { return y; }
    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    // Method to get both x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method to display Point details
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Additional method to calculate distance to another point
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
    }
}