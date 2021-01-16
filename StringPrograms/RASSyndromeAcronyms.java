/*
PROGRAM-11
RAS Syndrome Acronyms:
Automated Teller machine => ATM Machine
*/
package StringPrograms;
import java.util.Scanner;
class RASSyndromeAcronyms{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Abbreviation: ");
		String s = sc.nextLine().trim();
		String[] parts = s.split(" ");
		String acronym = "";
		int L = parts.length;
		for(int i=0; i<L; i++)
			acronym += Character.toUpperCase(parts[i].charAt(0))+"";
		String RAS = acronym + " " + acronym.charAt(L-1) + parts[L-1].substring(1);
		System.out.println("RAS Syndrome Acronym: " + RAS);
		sc.close();
	}
}