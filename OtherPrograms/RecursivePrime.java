//Program-30
package OtherPrograms;

import java.util.Scanner;

public class RecursivePrime {
	
	static boolean isPrime(int n, int i) 
    { 
        // Base cases 
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
       
        return isPrime(n, i + 1); 
	}
	static boolean isPrime(int n){ return isPrime( n, 2);} //MonoCaller
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(isPrime(n))
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is not a Prime Number");
		sc.close();
	}
}
