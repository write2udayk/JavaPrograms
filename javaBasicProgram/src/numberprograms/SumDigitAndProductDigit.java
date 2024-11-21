package numberprograms;

import java.util.Scanner;

/**
 * This program calculates the sum and product of the digits of an input number.
 * <p>
 * The program prompts the user to enter a number, and then iterates through
 * each digit of the number to compute both the sum and the product of its
 * digits.
 * </p>
 * <p>
 * Example: For the input number 123, the output will be:
 * Sum of digits: 6 (1 + 2 + 3)</li>
 * Product of digits: 6 (1 * 2 * 3)</li>
 * </p>
 */
public class SumDigitAndProductDigit {

    /**
     * The main method which acts as the entry point of the program.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a number!");
        int num = s.nextInt();

        // Initialize variables to store the sum and product of digits
        int sum = 0;
        int product = 1;

        // Loop through each digit of the number
        while (num > 0) {
            int rem = num % 10; // Extract the last digit
            sum += rem;         // Add digit to the sum
            product *= rem;     // Multiply digit to the product
            num /= 10;          // Remove the last digit
        }

        // Display the results
        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);

        s.close(); // Close the scanner to prevent resource leaks
    }
}
