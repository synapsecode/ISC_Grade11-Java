//Program-31
//Magic Number= 50113
// => 5+0+1+1+3=10
// => 1+0=1 single digit reduction is one hence it's magic
package RecursionPrograms;

import java.util.Scanner;

public class RecursiveMagicNumber {

	public static int magicReduce(int n, int s) {
		if (n == 0 && s < 10)// base condition
			return s;
	 	else {
			s += n % 10;
			if (n == 0) {
				n = s;
				s = 0;
			}
			return magicReduce(n / 10, s);
		}
	}
	public static boolean isMagicNumber(int n) { return (magicReduce(n, 0) == 1);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if (isMagicNumber(n))
			System.out.println(n + " is a Magic Number");
		else
			System.out.println(n + " is not a Magic Number");
		sc.close();
	}
}
