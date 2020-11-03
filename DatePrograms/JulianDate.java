package DatePrograms;

import java.util.Scanner;

public class JulianDate extends MyDateExtensions
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\nEnter Date in Words (or 'X' to Exit): ");
			String dx = sc.nextLine().trim();
			if(dx.equalsIgnoreCase("x")) break;
			String[] dy = convertDate(dx).split(" ");
			int d = Integer.parseInt(dy[0]);
			int month_ptr = Integer.parseInt(dy[1]); //Get Month Index
			int y = Integer.parseInt(dy[2]);

			System.out.println("Julian Date: " + (getJulianDate(d, month_ptr+1, y) - 31));
		}
		sc.close();
	}
}