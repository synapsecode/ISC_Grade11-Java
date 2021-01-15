/*
PROGRAM 7
PrimePalindrome
*/
package OtherPrograms;
import java.util.Scanner;

public class PrimePalindrome {

	public static boolean isPalindrome(int n){
		String s = n+"";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		return rev.equals(s);
	}

	public static boolean isPrime(int n){
		int i = 2;
		while(i*i <= n){
			if(n%i==0) return false;
			i++;
		}
		return (n==1) ? false : true;
	}

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
