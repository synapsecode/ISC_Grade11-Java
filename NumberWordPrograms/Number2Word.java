//Program-39
package NumberWordPrograms;

import java.util.Scanner;

/*
Limited to 9999 as its repetitive
Recursive Version has much more range
*/

public class Number2Word
{
    static String[] T = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] TX = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] O = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static int[] splitParts(int n){
         int first = Integer.parseInt((n + "").charAt(0) + "");
         int rest = Integer.parseInt((n + "").substring(1) + "");
         int[] out = {first, rest};
         return out;
    }
    
    static String getOnes(int n){
        return (n==0) ? "" : (O[n-1]);
    }
    
    static String getTens(int n){
        String r = "";
        if(n>=10 && n<20)
            r =  TX[n-10]; //First Tens 11-19
        else if(n>=20 && n<100){
           int t = Integer.parseInt((n + "").charAt(0) + "");
           int o = Integer.parseInt((n + "").charAt(1) + "");
           r =  T[t-2] + " " + getOnes(o); //Rest of the Tens
        }
        return r;
    }
    
    static String getHundreds(int x){
        int[] parts = splitParts(x);
        return "" + getOnes(parts[0]) + " hundred " + ((parts[1] == 0) ? "" : "and ") + ((parts[1] < 10) ? getOnes(parts[1]) : getTens(parts[1]));
    }
    
    static String getThousands(int x){
         int[] parts = splitParts(x);
        return "" + getOnes(parts[0]) + " thousand " + ((parts[1] >= 100) ? getHundreds(parts[1]) : (parts[1] < 10) ? getOnes(parts[1]) : getTens(parts[1]));
    }
    static void runner(int n){
        if(n>0 && n<10000){
            System.out.println();
            if(n>=1 && n<10)
                System.out.println(getOnes(n));
            else if(n>=10 && n<100)
                System.out.println(getTens(n));
            else if(n>=100 && n<1000)
                System.out.println(getHundreds(n));
            else if(n>=1000)
                System.out.println(getThousands(n));
            System.out.println();
        }else{
            System.out.println("CONSTRAINTS NOT SATISFIED");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number(1,10000) or -1 to Exit: ");
            int x = sc.nextInt();
            if(x == -1)
                break;
            else
                runner(x);
		}
		sc.close();
    }
}
