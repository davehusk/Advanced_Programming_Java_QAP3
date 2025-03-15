// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the sum of the integers in the line.
// Modified to handle non-integer tokens by catching NumberFormatException
// and continuing to process the line.
//          
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        boolean hasIntegers = false; // Flag to check if any integers were found
        Scanner scan = new Scanner(System.in);

        // Prompt for and read in a line of input
        System.out.println("Enter a line of text");
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        // Process each token in the line
        while (scanLine.hasNext()) {
            try {
                // Try to parse the token as an integer
                val = Integer.parseInt(scanLine.next());
                sum += val; // Add to the sum if successful
                hasIntegers = true; // Set flag to true
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens
            }
        }

        // Print the sum or a message if no integers were found
        if (hasIntegers) {
            System.out.println("The sum of the integers on this line is " + sum);
        } else {
            System.out.println("No integers found in the input.");
        }
    }
}