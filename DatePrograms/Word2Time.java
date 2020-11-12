package DatePrograms;

import java.util.Scanner;

/*
5 minutes past 10
10 minutes to 10
*/
public class Word2Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\nEnter the Number (or 'x' to Exit): ");
			String in = sc.nextLine().trim();
			if(in.equalsIgnoreCase("x")) break;
			String[] sx = in.split(" ");
			int m = Integer.parseInt(sx[0]);

			int t = Integer.parseInt(sx[3]);

			int time_in_minutes = t * 60;
			int result = 0;
			String timetype = sx[1];
			if (timetype.equals("minutes")) {
				result = (sx[2].equals("to")) ? time_in_minutes - m : time_in_minutes + m;
			} else {
				result = (sx[2].equals("to")) ? Math.abs(time_in_minutes - 60 * m) : time_in_minutes + 60 * m;
			}

			// boolean X = false;
			int hours = (result/60);
			int minutes = (result % 60);
			// if(hours > 24){
			// 	hours = hours % 24;
			// 	if(hours > 12){
			// 		hours /= 12;
			// 		X = true;
			// 	}
			// }
			String min = (minutes < 10) ? "0"+minutes : minutes+"";
			System.out.println("Current Time: " + hours + ":" + min);
			sc.reset();
		}
		sc.close();
	}
}
