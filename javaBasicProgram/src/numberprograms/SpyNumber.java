package numberprograms;

import java.util.Scanner;

/**
 * The SpyNumber class checks whether a given number is a Spy Number.
 * 
 * A Spy Number is a number where the sum of its digits is equal to the product of its digits.
 * For example, 1124 is a Spy Number because:
 * Sum: 1 + 1 + 2 + 4 = 8
 * Product: 1 * 1 * 2 * 4 = 8
 * Since the sum and product are equal, 1124 is a Spy Number.
 */
public class SpyNumber {

    /**
     * The entry point of the program. It prompts the user to input a number and 
     * checks whether the given number is a Spy Number.
     * 
     * A Spy Number is a number where the sum of its digits is equal to the product
     * of its digits.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = s.nextInt();
        
        // Check if the number is a Spy Number
        boolean result = checkSpyNumber(num);
        
        // Output result based on the check
        System.out.println(
            result == true ? "Given number is SpyNumber " + result :
            "Given number is not SpyNumber " + result);
    }

    /**
     * Checks whether a given number is a Spy Number.
     * A Spy Number is a number where the sum of its digits is equal to the product
     * of its digits.
     * 
     * @param num The number to check.
     * @return true if the number is a Spy Number, false otherwise.
     */
    public static boolean checkSpyNumber(int num) {
        int sum = 0;
        int pro = 1;

        // Loop through the digits of the number
        while (num != 0) {
            int rem = num % 10; // Extract the last digit
            sum += rem;         // Add it to the sum
            pro *= rem;         // Multiply it to the product
            num /= 10;          // Remove the last digit
        }

        // If sum equals product, return true (it's a Spy Number)
        return sum == pro;
    }
}
