package numberprograms;

import java.util.Scanner;

/**
 * The Tables class generates multiplication tables for numbers.
 * It prompts the user to input a number and then prints the multiplication table
 * for each number from 1 to the entered number.
 * 
 * For example, if the user enters 3, the program will print:
 * 1x1=1, 1x2=2, ..., 1x10=10
 * 2x1=2, 2x2=4, ..., 2x10=20
 * 3x1=3, 3x2=6, ..., 3x10=30
 * 
 * The program iterates through each number from 1 to the given number and prints
 * the corresponding multiplication table.
 */
public class Tables {

    /**
     * The entry point of the program. It prompts the user for a number and then
     * prints the multiplication tables from 1 to the entered number.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number! Which table you want to print?");
        int num = s.nextInt();

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= num; i++) {
            // Print the multiplication table for each number
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            // Print a blank line after each table for clarity
            System.out.println();
        }
    }
}
