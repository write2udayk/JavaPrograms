package numberprograms;

import java.util.Scanner;

/**
 * The Factors class calculates and prints the total number of divisors for a 
 * given number. It uses an optimized approach by counting divisors only up to 
 * the square root of the number. A divisor is a number that divides the given 
 * number completely (without leaving a remainder). The program handles perfect 
 * squares correctly by counting the square root only once.
 * 
 * Example: For the number 36, the divisors are: 1, 2, 3, 4, 6, 9, 12, 18, 36.
 * The program prints the total number of divisors of the given number.
 */
public class Factors {

    /**
     * The main method of the program. It takes a number from the user, calculates 
     * the number of divisors using the {@link #countDivisors(double)} method, 
     * and prints the result.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number!");
        double num = s.nextDouble();
        int divisorCount = countDivisors(num);
        System.out.println("Total number of divisors: " + divisorCount);
        printDivisors(num);
    }

    /**
     * This method calculates the number of divisors of the given number.
     * It uses the property that divisors occur in pairs: if 'i' is a divisor of 
     * 'number', then 'number/i' is also a divisor. The loop only checks up to 
     * the square root of the number for efficiency. If the number is a perfect 
     * square (e.g., 36), the square root is counted only once.
     *
     * @param number The number for which divisors are to be counted.
     * @return The total number of divisors of the given number.
     */
    public static int countDivisors(double number) {
        int count = 0;
        double sqrt = Math.sqrt(number); // Find square root for optimization

        // Loop through all numbers from 1 to the square root of the number
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) { // Check if i is a divisor
                // If i is not equal to number / i, count both divisors
                if (i == number / i) {
                    count += 1;
                } else {
                    count += 2; // If i == number / i, count only once (for perfect squares)
                }
            }
        }

        return count; // Return the total number of divisors
    }
    
    public static void printDivisors(double number) {
        double sqrt = Math.sqrt(number); // Find square root for optimization

        // Loop through all numbers from 1 to the square root of the number
        System.out.println("Divisors of " + (int)number + " are: ");
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) { // Check if i is a divisor
                // If i is equal to number / i, print only
            	//one divisor (for perfect squares)
                if (i == number / i) {
                    System.out.print(i + " ");
                } else {
                    // Print both divisors (i and number / i)
                    System.out.print(i + " ");
                    System.out.print((int)(number / i) + " ");
                }
            }
        }
        System.out.println(); // New line after printing all divisors
    }
}
