//Program-51
package DatePrograms;
import java.io.*;

class FridayThe13th extends MyDateExtensions{

	static int addDay(int x){
		return x%7;
	}

	static int indexOf(String[] x, String a){
        int index = -1;
        for(int i=0; i<x.length; i++){
            if(x[i].equals(a)){
                index = i;
                break;
            }  
        }
        return index;
    }

	static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		
		while(true){
			BufferedReader br = new BufferedReader(ir);
			System.out.print("\nEnter the Year (YYYY) or 'x' to Exit: ");
			String in = br.readLine().trim();
			if(in.equalsIgnoreCase("x")) break;
			int Y = Integer.parseInt(in);
			System.out.print("Enter First Day of Year: ");

			//Handling Leap Years
			if(isLeapYear(Y))
				daysInMonth[1] = 29; 
			else
				daysInMonth[1] = 28;

			String DX = br.readLine().trim();
			int D = 0;
			D = indexOf(days, DX);

			for(int M = 0; M < 12; M++){
				//System.out.println(months[M] + "  |  " + days[D]);
				if(D == 0)
					System.out.println("Friday the 13th in: " + months[M]);
				if(daysInMonth[M] == 30)
					D = addDay(D+2);
				else if(daysInMonth[M] == 31)
					D = addDay(D+3);
				else if(daysInMonth[M] == 29)
					D = addDay(D+1);
			}
		}
		ir.close();
	}
}

