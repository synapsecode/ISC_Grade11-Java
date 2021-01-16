/*
PROGRAM-33
Harshad Number => Number divisible by sum of digits
A Multiple Harshad number is an integer which when divided by the sum of its digits, 
produces another Harshad number. 
For example, consider the number 6804. 6 + 8 + 0 + 4 = 18. 1 + 8 = 9.
*/
package SpecialNumbers;

import java.util.Scanner;

public class MultipleHarshadNumber {
	public static int sumOfDigits(int n) {
		int sum = 0;
		for (int i = n; i != 0; i /= 10)
			sum += i % 10;
		return sum;
	}

	static boolean isMultipleHarshadNumber(int n) {
		int sum, c, d;
		while (n > 1) {
			sum = 0; // add this
			c = n;
			while (c > 0) {
				d = c % 10;
				sum = sum + d;
				c = c / 10;
			}
			if (n % sum == 0) {
				n = n / sum;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		if (isMultipleHarshadNumber(n))
			System.out.println(n + " is a Multiple Harshad number.");
		else
			System.out.println(n + " is not a Multiple Harshad number.");

		sc.close();
	}

}
