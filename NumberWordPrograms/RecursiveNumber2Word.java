package NumberWordPrograms;

import java.util.Scanner;

public class RecursiveNumber2Word
{
    static String[] T = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] TX = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] O = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static long[] splitParts(long n){
         long first = Long.parseLong((n + "").charAt(0) + "");
         long rest = Long.parseLong((n + "").substring(1) + "");
         long[] out = {first, rest};
         return out;
    }

    static void print(String s){
        String[] sx = s.split(" ");
        String[] x = new String[sx.length];
        for(int i=0; i<sx.length; i++){
            x[i] = sx[i].trim();
        }
        System.out.println(String.join(" ", x));
    }
    
    public static String numberToWord(long n){
        String ret = "";
        String s = n + "";
        int l = s.length();
        if(l == 1){
            //ones [1, 10)
            ret = (n==0) ? "" : (O[(int)n-1]); 
        } else if(l == 2){
            //Tens [10, 100)
            if(n>=10 && n<20)
                ret =  TX[(int)n-10]; //10-19
            else if(n>=20 && n<100){ //20-99
                long t = Long.parseLong((n + "").charAt(0) + "");
                long o = Long.parseLong((n + "").charAt(1) + "");
                ret =  T[(int)t-2] + " " + numberToWord((int)o); 
            }
        } else if(l == 3){
            //Hundreds [100, 1K)
            long[] parts = splitParts(n);
            ret =  "" + numberToWord(parts[0]) + " hundred" + ((parts[1] == 0) ? "" : " and ") + numberToWord(parts[1]);
        } else {
            /*
            Thousands [1K, 1M)
            Millions [1M, 1B)
            Billions [1B, 1T)
            Trillions [1T, 1QD)
            Quadrillions [1QD, 1QT)
            Quintillions [1QT, 1SX)
            */

            int pl = (l > 3 && l < 7) ? 6 :
                     (l > 6 && l < 10) ? 9 :
                     (l > 9 && l < 13) ? 12 :
                     (l > 12 && l < 16) ? 15 :
                     (l > 15 && l < 19) ? 18 :
                     (l > 18 && l < 22) ? 21 :
                     24;
            String place =  (l > 3 && l < 7) ? " thousand " :
                            (l > 6 && l < 10) ? " million ":
                            (l > 9 && l < 13) ? " billion " :
                            (l > 12 && l < 16) ? " trillion " :
                            (l > 15 && l < 19) ? " quadrillion " :
                            (l > 18 && l < 22) ? " quintillion " :
                            " sextillion ";

            String padding = new String(new char[pl-l]).replace("\0", "0");
            long first = Long.parseLong((padding + n + "").substring(0, 3) + "");
            long rest = Long.parseLong((padding + n + "").substring(3) + "");
            ret =  "" + numberToWord(first) + place + numberToWord(rest);
        }
        return ret;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("\nEnter a number or 'x' to Exit: ");
            String inp = sc.nextLine();
            if(inp.equalsIgnoreCase("x")) break;
            
            if(!inp.contains(".")){
                //Whole Numbers
                long x = Long.parseLong(inp);
                if(x > 0){
                    print(numberToWord(x));
                }else if(x == 0){
                    print("Zero");
                }else{
                    print("negative " + numberToWord(Long.parseLong(inp.substring(1))));
                }
            }else{
                //Decimals
                inp = inp.replace(".", " ");
                //Decimal
                String[] ix = inp.split(" ");
                long nx = Long.parseLong(ix[0]);
                long dx = Long.parseLong(ix[1]);
                boolean negflag = false;

                if(nx < 0) negflag = true;
                nx = negflag ? Integer.parseInt((nx + "").substring(1)) : nx;

                if(dx == 0){
                    print((negflag ? "negative " : "") + (nx == 0 ? "zero" : numberToWord(nx)) + " point zero");
                } else{
                    String w = "";
                    for(char x : (dx+"").toCharArray()){
                        w += O[ Integer.parseInt(""+x) - 1 ] + " ";
                    }
                    w = w.trim();
                    print((negflag ? "negative " : "") + (nx == 0 ? "zero" : numberToWord(nx)) + " point " + w);
                }   
            }
        }
		sc.close();
    }
}
