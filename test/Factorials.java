// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
// Modified to throw IllegalArgumentException for invalid inputs
// (negative numbers or numbers greater than 16) and handle the
// exception in the main method.
//          
// ****************************************************************
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        // Loop to allow the user to calculate multiple factorials
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            try {
                // Read the integer and compute its factorial
                int val = scan.nextInt();
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Print the exception message for invalid inputs
                System.out.println(e.getMessage());
            } finally {
                // Ask the user if they want to continue
                System.out.print("Another factorial? (y/n) ");
                keepGoing = scan.next();
            }
        }
    }
}