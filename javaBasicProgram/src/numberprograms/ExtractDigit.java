package numberprograms;

import java.util.Scanner;

/**
 * The ExtractDigit class is a utility to extract and print individual digits
 * of a given number in reverse order.
 *
 * <p>This program reads an integer from the user, then extracts each digit
 * starting from the least significant digit (rightmost) and prints it.
 */
public class ExtractDigit {

    /**
     * The entry point for the program. It prompts the user to enter an integer
     * and prints its digits one by one in reverse order.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = s.nextInt();

        // Extract and print digits of the number
        while (num != 0) {
            int rem = num % 10; // Get the last digit
            System.out.println(rem); // Print the digit
            num /= 10; // Remove the last digit
        }
    }
}
