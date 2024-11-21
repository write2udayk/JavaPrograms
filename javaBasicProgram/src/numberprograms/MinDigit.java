package numberprograms;

import java.util.Scanner;

/**
 * This class provides functionality to find the minimum digit in a given
 * number.
 */
public class MinDigit {
	/**
	 * The main method takes a number input from the user and displays the minimum
	 * digit.
	 *
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();

		int min = findMaxDigit(num);
		System.out.println("The minimum digit is: " + min);

		s.close();
	}

	/**
	 * Finds the minimum digit in a given number.
	 *
	 * @param num the number to check
	 * @return the minimum digit in the number
	 */
	public static int findMaxDigit(int num) {
		int min = 9;

		while (num > 0) {
			int rem = num % 10;
			if (min > rem) {
				min = rem;
			}
			num /= 10;
		}
		return min;
	}
}
