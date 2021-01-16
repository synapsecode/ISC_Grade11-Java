//Program-43
package DatePrograms;

import java.io.*;
import Common.MyDateExtensions;

public class ProjectAllotedDateFinder extends MyDateExtensions
{
    public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

        while(true){
            System.out.print("\nEnter the Submission Date (or 'X to Exit): ");
            String sb = br.readLine().trim();
			if(sb.equalsIgnoreCase("x")) break;
			System.out.print("Number of days allotted to complete it: ");
            int allotted_days = Integer.parseInt(br.readLine());
            String conv_sb = convertDate(sb);
            String x[] = conv_sb.split(" ");
            int d = Integer.parseInt(x[0]);
            int m = Integer.parseInt(x[1]);
            int y = Integer.parseInt(x[2]);
            int start_julianDate = getJulianDate(d, m, y);
            int end_julianDate = start_julianDate - allotted_days;
            if(end_julianDate < 0){ //goes back upto 1 year
                y = y-1;
                end_julianDate = (isLeapYear(y) ? 366 : 365) - (-end_julianDate);
            }      
            String alloted_day = julianToGregorianDate(end_julianDate, y); //+1 To Include Start Date
            System.out.println("The Project was allotted on: " + alloted_day);
		}
    }
}
