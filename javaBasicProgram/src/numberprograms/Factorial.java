package numberprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find factorial!");
		int num = s.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
