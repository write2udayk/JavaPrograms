package numberprograms;

import java.util.Scanner;

public class SumDigitAndProductDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();

		int sum = 0;
		int product = 1;

		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num /= 10;
		}

		System.out.println("Product of digit  : " + product);
		System.out.println("Sum of digit  : " + sum);
	}

}
