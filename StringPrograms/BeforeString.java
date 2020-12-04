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
		
		// while(true){
		// 	int spos1 = s.indexOf(second, 0); //Position of Second Character
		// 	if(spos1 == -1) break; //If Second Char doesnt exist in substring

		// 	System.out.println("STR: " + s + "    |    " + spos1);
		// 	String prev = s.substring(0, spos1+1); //Substring until Second Character (inclusive)
		// 	int prev_f_index = prev.indexOf(first); //Position of First Character in that Substring

		// 	System.out.println("PREV: " + prev + "    |    " + prev_f_index);
		// 	if(prev_f_index == -1) flag = true; //If First Position doesnt exist, then its considered as True

		// 	else if(prev.charAt(prev_f_index) != first.charAt(0)){
		// 		flag = false;
		// 		break;
		// 	} //If Character at first Position in substring is not the same as first charecter, its false & we break out

		// 	s = s.substring(spos1+1);
		// }
		// System.out.println(ns.indexOf(first, -1));
		// if(ns.indexOf(first, ns.indexOf(second)) > ns.indexOf(first))
		// 	flag = false;

		// System.out.println(flag);
	}
}
