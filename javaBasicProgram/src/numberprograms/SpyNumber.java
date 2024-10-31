package numberprograms;

import java.util.Scanner;

//A spy number is a number where the sum of its digits
//is equal to the product of its digits.

public class SpyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();
		boolean result = checkSpyNumber(num);
		System.out.println(
				result == true ? "Given number is SpyNumber " + result :
					"Given number is not spynumber " + result);
	}

	public static boolean checkSpyNumber(int num) {
		int sum = 0;
		int pro = 1;

		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			pro *= rem;

		}
		if (sum == pro) {
			return true;
		}
		return false;

	}

}
