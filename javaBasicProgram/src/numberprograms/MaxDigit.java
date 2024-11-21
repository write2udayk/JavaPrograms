package numberprograms;

import java.util.Scanner;

/**
 * This class provides functionality to find the maximum digit in a given
 * number.
 */
public class MaxDigit {

	/**
	 * The main method takes a number input from the user and displays the maximum
	 * digit.
	 *
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();

		int max = findMaxDigit(num);
		System.out.println("The maximum digit is: " + max);

		s.close();
	}

	/**
	 * Finds the maximum digit in a given number.
	 *
	 * @param num the number to check
	 * @return the maximum digit in the number
	 */
	public static int findMaxDigit(int num) {
		int max = 0;

		while (num > 0) {
			int rem = num % 10;
			if (max < rem) {
				max = rem;
			}
			num /= 10;
		}
		return max;
	}
}
