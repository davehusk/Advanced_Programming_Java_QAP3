// ParseInts.java
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text");
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        // Process each token in the line
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Try to parse the token as an integer
                sum += val; // Add to the sum if successful
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}