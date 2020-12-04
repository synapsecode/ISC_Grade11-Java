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

		//Padding
		for(int i=0; i<n; i++){
			String x = teams[i];
			int padding = max_len - x.length();
			String p = new String(new char[padding]).replace("\0", "_");
			teams[i] = (x+p);
		}

		//Interlacing the String
		String interlaced = "";
		int pos = 0;
		for(int x = 0; x<max_len; x++){
			for(int i = 0; i<n; i++){
				String s = teams[i];
				interlaced += s.charAt(pos);
			}
			pos += 1;
		}

		//Display
		System.out.println();
		System.out.println();
		int ctr = 0;
		for(int i=0; i<interlaced.length(); i++){
			if(ctr==n){
				System.out.println();
				ctr=0;
			}
			String ch = (interlaced.charAt(i) == '_') ? " " : interlaced.charAt(i)+"";
			System.out.print(ch + "\t");
			ctr++;
		}
		
	}
}