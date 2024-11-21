package numberprograms;

import java.util.Scanner;

public class CheckFirstDigitEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = s.nextInt();
		num = Math.abs(num);

		checkfirstEvenOrOdd(num);

	}

	public static void checkfirstEvenOrOdd(int num) {
		
		if (num < 10) {
			System.out.println(num % 2 == 0 ? "First is digit Even number! " : "First digit is Not even num");
		} else {
			while (num > 9) {
				num /= 10;
			}
			if (num % 2 == 0) {
				System.out.println("First digit is even : " + num);
			} else {
				System.out.println("First digit is Not even num : "+ num);
			}
		}

	}
}
