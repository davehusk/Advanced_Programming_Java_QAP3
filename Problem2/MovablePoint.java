// MovablePoint.java
public class MovablePoint extends Point {
    private float xSpeed; // Speed in the x-direction
    private float ySpeed; // Speed in the y-direction

    // Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call the superclass constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed); // Default position
    }

    public MovablePoint() {
        this(0.0f, 0.0f); // Default constructor
    }

    // Getter and Setter methods
    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move method
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Speed: (" + xSpeed + ", " + ySpeed + ")";
    }
}