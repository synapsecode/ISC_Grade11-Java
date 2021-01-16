/*
PROGRAM-5
ADAM NUMBER - N^2 is reversed form of (N reversed)^2
PRIME ADAM NUMBER - Prime Number (without leading zeros) that's also an Adam Number
*/
package SpecialNumbers;

import java.util.Scanner;

public class PrimeAdamNumber {
	public static boolean isPrime(int n){
		int i = 2;
		while(i*i <= n){
			if(n%i==0) return false;
			i++;
		}
		return (n==1) ? false : true;
	}

	public static String getReversed(String s){
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		return rev;
	}

	public static boolean isAdam(int n){
		String x = n+"";
		int revX = Integer.parseInt(getReversed(x));
		String sq = (n*n)+"";
		String revSq = (revX*revX)+"";
		return getReversed(sq).equals(revSq);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		if(isPrime(n) && isAdam(n))
			System.out.println(n+" is a Prime-Adam Number");
		else
			System.out.println(n+" is not a Prime-Adam Number");
		sc.close();
	}
}
