//Program-42
package DatePrograms;

import java.util.Scanner;
import Common.MyDateExtensions;

public class DateDifference extends MyDateExtensions
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter the Starting Date and Ending Date (or 'X' to Exit): ");
            String d1 = sc.nextLine().trim();
            if(d1.equalsIgnoreCase("x")) break;
            String d2 = sc.nextLine().trim();
            d1 = convertDate(d1);
            d2 = convertDate(d2);
            System.out.println("Difference: " + getDateDifference(d1, d2) + " Days");
        }
        sc.close();
    }
}
