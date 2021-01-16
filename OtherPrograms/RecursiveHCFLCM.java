//Program-29
package OtherPrograms;

import java.util.Scanner;

public class RecursiveHCFLCM {
	public static int hcf(int p, int q){
        if(q == 0)
            return p;
        return hcf(q, p % q);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		int a = sc.nextInt();
		System.out.print("Enter B: ");
		int b = sc.nextInt();
		int p = a * b;
		int hcf = hcf(a, b);
		int lcm = p/hcf;
		System.out.println("HCF: " + hcf + " | LCM: " + lcm);
		sc.close();
	}
}
