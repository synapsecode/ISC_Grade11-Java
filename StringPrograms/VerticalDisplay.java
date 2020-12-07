package StringPrograms;
import java.util.Scanner;

public class VerticalDisplay{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many teams are present? ");
		int n = Integer.parseInt(sc.nextLine().trim());
		String[] teams = new String[n];
		System.out.println("Enter the names of all the teams: ");
		int max_len = 0;

		for(int i=0; i<n; i++){
			String in = sc.nextLine().trim();
			teams[i] = in;
			max_len = (teams[i].length() > max_len) ? teams[i].length() : max_len;
		}

		for(int j=0; j<max_len; j++){
			for(int i=0; i<n; i++){
				String x = teams[i];
				if(j < (x.length()))
					System.out.print(x.charAt(j)+" \t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
		
	}
}