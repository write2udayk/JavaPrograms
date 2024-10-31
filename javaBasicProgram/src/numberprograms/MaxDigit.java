package numberprograms;

import java.util.Scanner;

public class MaxDigit {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();

		int max = 0;

		while (num > 0) {
			int rem = num % 10;
			if (max < rem) {
				max = rem;
			}
			num /= 10;

		}
		System.out.println(max);
	}

}
