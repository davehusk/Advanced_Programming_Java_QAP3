// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side); // All sides are equal
    }

    // Override isRegular method (an equilateral triangle is always regular)
    @Override
    public boolean isRegular() {
        return true;
    }
}