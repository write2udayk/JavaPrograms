package numberprograms;

import java.util.Scanner;

/**
 * The PerfectNumber class provides functionality to check if a given number is
 * a perfect number. A perfect number is a positive integer that is equal to the
 * sum of its proper divisors, excluding itself.
 * 
 * Example: 6 is a perfect number because 1 + 2 + 3 = 6.
 * 
 * This class prompts the user to enter a number and then checks if the entered
 * number is a perfect number. It uses a helper method to calculate the sum of
 * divisors and compares it to the number itself.
 * 
 * The program returns true if the number is perfect, and false otherwise.
 */
public class PerfectNumber {
    
    /**
     * The entry point for the program. It prompts the user to enter a number and
     * then checks whether the entered number is a perfect number.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number:");
        int num = s.nextInt();
        System.out.println(num + " is a perfect number: " + checkPerfectNumber(num));
    }

    /**
     * Checks whether a given number is a perfect number. A perfect number is a
     * positive integer that is equal to the sum of its proper divisors (excluding
     * itself).
     * 
     * If the number is less than or equal to 1, the method returns false as there
     * are no perfect numbers in this range.
     *
     * @param num The number to check.
     * @return true if the number is perfect, false otherwise.
     */
    public static boolean checkPerfectNumber(int num) {
        // Return false immediately if the number is less than or equal to 1
        if (num <= 1) {
            return false;
        }

        int sum = 0;
        // Find divisors of num and sum them up
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Return true if the sum of divisors equals the number, indicating it's perfect
        return sum == num;
    }
}
