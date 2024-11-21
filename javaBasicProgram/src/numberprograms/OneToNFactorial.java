package numberprograms;

import java.util.Scanner;

/**
 * The OneToNFactorial class calculates the factorial of numbers in a given
 * range from start to end (inclusive).
 * 
 * It prompts the user for the starting and ending numbers, and for each number
 * in that range, it calculates and prints the factorial of that number.
 */
public class OneToNFactorial {

    /**
     * The entry point of the program. It prompts the user to input a starting
     * number and an ending number, then calculates and prints the factorial of 
     * each number in that range.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input the starting and ending numbers from the user
        System.out.println("Enter the starting number!");
        int start = s.nextInt();
        System.out.println("Enter the ending number!");
        int end = s.nextInt();

        // Calculate factorial for each number in the given range
        for (int i = start; i <= end; i++) {
            int fact = 1;
            // Calculate the factorial of i
            for (int j = i; j > 1; j--) {
                fact *= j;
            }
            // Print the factorial
            System.out.println("Factorial of " + i + " : " + fact);
        }
    }
}
