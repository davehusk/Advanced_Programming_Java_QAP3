// MovablePoint.java
public class MovablePoint extends Point {
    private float xSpeed; // Speed in the x-direction
    private float ySpeed; // Speed in the y-direction

    // Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call superclass constructor
        setXSpeed(xSpeed); // Validate and set xSpeed
        setYSpeed(ySpeed); // Validate and set ySpeed
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed); // Default position
    }

    public MovablePoint() {
        this(0.0f, 0.0f); // Default constructor
    }

    // Getter and Setter methods
    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    // Method to get both xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Method to move the point
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // toString method to display MovablePoint details
    @Override
    public String toString() {
        return super.toString() + ", Speed: (" + xSpeed + ", " + ySpeed + ")";
    }

    // Additional method to check if the point is moving diagonally
    public boolean isMovingDiagonally() {
        return xSpeed != 0 && ySpeed != 0;
    }
}