//Program-52
package StringPrograms;
import java.util.Scanner;
/*
You are given 3 inputs
check if first letter comes before every instance of second letter
*/

public class BeforeString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine().trim().toLowerCase();
		System.out.print("Enter First Character: ");
		String first = sc.next().trim().toLowerCase();
		System.out.print("Enter Second Character: ");
		String second = sc.next().trim().toLowerCase();

		//If the last index of the first character is greater than the first index of the second character, then its false
		System.out.println( !( s.lastIndexOf(first) > s.indexOf(second) ) );

		sc.close();
		
	}
}
