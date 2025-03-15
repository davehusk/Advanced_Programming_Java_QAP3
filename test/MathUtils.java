// MathUtils.java
public class MathUtils {
    // Returns the factorial of the argument given
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial is too large for int type (n > 16).");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}