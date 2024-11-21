package numberprograms;

import java.util.Scanner;

/**
 * The Factorial program calculates the factorial of a given number.
 * The factorial of a number is the product of all positive integers less 
 * than or equal to that number. For example, factorial of 5 is 5*4*3*2*1 = 120.
 */
public class Factorial {

    /**
     * The entry point for the program. It reads a number from the user and 
     * calculates its factorial.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factorial!");

        // Read the input number from the user
        int num = s.nextInt();

        // Initialize the factorial to 1
        long fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            fact *= i; // Multiply each number to get the factorial
        }

        // Print the calculated factorial
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
