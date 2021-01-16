//Program-37
package OtherPrograms;

import java.util.Scanner;

public class RecursiveAnagram {
	static boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		if(s1.length() == 0 && s2.length()==0) return true;
		int index = s2.indexOf(s1.charAt(0)+"");
		if(index == -1) return false;
		s1 = s1.substring(1);
		s2 = s2.substring(0, index) + s2.substring(index+1);
		return isAnagram(s1, s2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Word 1: ");
		String s1 = sc.next().trim();
		System.out.print("Enter Word 2: ");
		String s2 = sc.next().trim();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(isAnagram(s1, s2))
			System.out.println("They are Anagrams");
		else
			System.out.println("They are not Anagrams");
		sc.close();
	}
}
