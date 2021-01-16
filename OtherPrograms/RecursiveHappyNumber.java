//Program-32
package OtherPrograms;

import java.util.Scanner;

public class RecursiveHappyNumber {
	private static boolean isHappy(int num) {
		if (num == 1)
			return true;
		if (num == 4)
			return false;

			int sum = 0;
			while (num > 0) {
				sum += Math.pow(num % 10, 2);
				num = num / 10;
			}

		// recall the function with sum value
		return isHappy(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(isHappy(n))
			System.out.println(n + " is a Happy Number");
		else
			System.out.println(n + " is not a Happy Number");
		sc.close();
	}

}
