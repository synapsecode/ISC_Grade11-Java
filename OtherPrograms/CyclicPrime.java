package OtherPrograms;
import java.util.Scanner;

public class CyclicPrime {
	//Fast Prime Number Implementation
	public static boolean isPrime(int n){
		int i = 2;
		boolean ret = false;
        while(i*i <= n){
			if(n%i == 0){
				ret = true;
				break;
			}	
			i++;
		}
		return !ret;
	}

	public static boolean isCyclicPrime = true;

	static boolean recursiveCyclicRotations(String s, int i){
		int n = s.length();
		if(i==0) isCyclicPrime = true; //Resetting isCyclicPrime if i=0
		if(i==n) return isCyclicPrime; //BaseCase

		String x = s.substring(i) + s.substring(0,i); //Shift first char to last
		int num = Integer.parseInt(x);

		//StickyValue: anything && false is always false hence
		//if even one cyclic rotation isnt prime the whole number isnt a cyclicprime
		isCyclicPrime = isCyclicPrime && isPrime(num);

		recursiveCyclicRotations(s, i+1);
		
		return isCyclicPrime;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check if it is a CyclicPrime: ");
		int n = sc.nextInt();
		if(recursiveCyclicRotations(n+"", 0))
			System.out.println("Cyclic Prime");
		else
			System.out.println("Not a Cyclic Prime\n");
		sc.close();
	}
}
