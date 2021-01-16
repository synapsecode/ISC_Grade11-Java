/*
PROGRAM 7
PrimePalindrome
*/
package SpecialNumbers;
import java.util.Scanner;

import Common.SharedFunctions;

public class PrimePalindrome extends SharedFunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		if(isPrime(n) && isPalindrome(n))
			System.out.println(n+" is a Prime-Palindrome Number");
		else
			System.out.println(n+" is not a Prime-Palindrome Number");
		sc.close();
	}
}
