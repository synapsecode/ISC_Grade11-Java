//Program-41
package DatePrograms;

import java.util.Scanner;

public class FormattedDate extends MyDateExtensions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date (DD/MM/YYYY): ");
		String date = sc.next().trim();
		String[] splits = (date.split("/"));
		int month = Integer.parseInt(splits[1]);
		System.out.println("\nFormatted Date: " + splits[0] + "/" + months[month - 1] + "/" + splits[2]);
	}
}
