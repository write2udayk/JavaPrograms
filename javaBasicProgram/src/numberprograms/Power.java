package numberprograms;

import java.util.Scanner;

/**
 * The Power class calculates the power of a given base raised to a specified
 * exponent.
 * 
 * It takes two inputs from the user: a base number and an exponent. The program
 * then calculates the base raised to the power of the exponent and prints the 
 * result step by step for each iteration.
 */
public class Power {
    
    /**
     * The entry point of the program. It prompts the user to input the base and
     * exponent, then calculates and displays the result of base raised to the
     * power of the exponent.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input the base and exponent from the user
        System.out.println("Enter a base number!");
        int base = s.nextInt();
        System.out.println("Enter an exponent:");
        int exp = s.nextInt();

        int power = 1;
        
        // Calculate and print the power for each step
        for (int i = 1; i <= exp; i++) {
            power *= base;
            System.out.println(base + " power " + i + " = " + power);
        }
    }
}
