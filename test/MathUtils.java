// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions. Modified to throw
// IllegalArgumentException for invalid inputs (negative numbers or
// numbers greater than 16) in the factorial method.
//          
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given. Throws
    // IllegalArgumentException if the argument is negative or
    // greater than 16.
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        // Check for negative input
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        // Check for input greater than 16 (to avoid integer overflow)
        if (n > 16) {
            throw new IllegalArgumentException("Factorial is too large for int type (n > 16). Use a larger data type.");
        }

        // Compute the factorial
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}