/*
PROGRAM-6
Kaprekar Number is a number whose sum of the left part and right part of squared number is same
*/
package SpecialNumbers;
import java.util.Scanner;
public class KaprekarNumber {

	public static boolean isKaprekar(int n){
		int sq = n*n;
		String squaredStr = sq+"";
		int len = squaredStr.length();
		if(len % 2 == 0){
			//Even
			int x = (int)Math.pow(10, len/2);
			int left = sq%x;
			int right = sq/x;

			if(left + right == n) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		if(isKaprekar(n))
			System.out.println(n+" is Kaprekar Number");
		else
			System.out.println(n+" is not a Kaprekar Number");
		sc.close();
	}
	
}
