//Program-39
package DatePrograms;
import java.io.*;
import Common.MyDateExtensions;

public class Julian2GregorianDate extends MyDateExtensions
{
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        while(true){
			System.out.print("\nEnter Julian Days (or -1 to Exit): ");
            int dn = Integer.parseInt(br.readLine());
            if(dn == -1)
				break;
			System.out.print("Enter Year: ");
            int y = Integer.parseInt(br.readLine());
			System.out.print("Number of Days to Jump: ");
			int n = Integer.parseInt(br.readLine());
			System.out.println(new String(new char[30]).replace("\0", "-"));
            System.out.println("Date: " + julianToGregorianDate(dn, y));
            //Future Date
            if(n > 0){
                System.out.println("Jump Date: " + futurejulianToGregorianDate(n, dn, y));
			}
			System.out.println(new String(new char[30]).replace("\0", "-"));
        }
    }
}
