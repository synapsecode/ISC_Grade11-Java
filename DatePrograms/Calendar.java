//Program-44
package DatePrograms;

import java.io.*;
public class Calendar extends MyDateExtensions
{
    static String[] days = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
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
    static String centerText(String s, int total){
        String ls = "", rs = "";
        int lsx=-1, rsx=-1;
         lsx = (total - (s.length()))/2;
        rsx = lsx;
        ls = new String(new char[lsx]).replace("\0", " ");
        rs = new String(new char[rsx]).replace("\0", " ");
        return ls+s+rs;
    }
    static void displayCalendar(int y, String m, String fdom){
        if(isLeapYear(y)) daysInMonth[1] = 29;
        int d_inm = daysInMonth[indexOf(months, m)];
        int index_fdom = indexOf(days, fdom);
        String[][] cal = new String[5][7];
        int k = 0;
        int maximum_displayed_date = 35 - index_fdom;
        
        System.out.println("DMAX: " + maximum_displayed_date);
        //Filling Up Calendar
        for(int i=0; i<5; i++){ //Weekdays(Rows)
            for(int j=0; j<7; j++){ //Columns
                //first row start
                if(i==0){
                    if(maximum_displayed_date >= d_inm){
                        if(j>=index_fdom) cal[i][j] = " " + ++k;
                        else cal[i][j] = "  ";
                    }else{
                        cal[0][j] = ""+(++maximum_displayed_date);
                    }
                }else{
                    if(k < d_inm)
                        cal[i][j] = (k+1 > 9) ? "" + ++k : " " + ++k;
                    else
                        cal[i][j] = "  ";
                }
                
            }
        }
        
        //Printing
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(centerText(m + " " + y, 28));
        System.out.println("----------------------------");
        System.out.println(" SUN MON TUE WED THU FRI SAT");
        System.out.println("----------------------------");
        for(int i=0; i<5; i++){ //Weekdays(Rows)
            for(int j=0; j<7; j++){ //Columns
                System.out.print(" " + cal[i][j] + " ");
            }
            System.out.println("\n----------------------------");
        }
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        while(true){  
            //Year Input
            System.out.print("Enter the Year (-1 to Exit): ");
            int y = Integer.parseInt(br.readLine().trim());
            if(y==-1) break;
            //Month Input
            System.out.print("Enter the Month: ");
            String m = br.readLine().trim().toLowerCase();
            m = (m.charAt(0) + "").toUpperCase() + m.substring(1);
            //Day Name Input
            System.out.print("First Day of " + m + ": ");
            String fdom = br.readLine().trim().toLowerCase();
            fdom = (fdom.charAt(0) + "").toUpperCase() + fdom.substring(1);

            //Getting Values
            displayCalendar(y, m, fdom);
            System.out.println();
        }

    }
}