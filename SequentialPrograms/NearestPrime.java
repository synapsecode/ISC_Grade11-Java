package SequentialPrograms;
import java.util.Scanner;

public class NearestPrime {
	//Optimizations -> Common Multiples eliminated
	public static boolean optimize(long n){
		if(n == 1) return true;
		if(n != 2 && n%2==0)
			return true;
		if(n != 3 && n%3==0)
			return true;
		if(n != 5 && n%5==0)
			return true;
		if(n != 7 && n%7==0)
			return true;
		if(n != 11 && n%11==0)
			return true;
		if(n != 13 && n%13==0)
			return true;
		if(n != 17 && n%17==0)
			return true;
		if(n != 19 && n%19==0)
			return true;
		if(n != 23 && n%23==0)
			return true;
		if(n != 29 && n%29==0)
			return true;
		if(n != 31 && n%31==0)
			return true;
		if(n != 37 && n%37==0)
			return true;
		if(n != 41 && n%41==0)
			return true;
		if(n != 43 && n%43==0)
			return true;
		if(n != 47 && n%47==0)
			return true;
		if(n != 53 && n%53==0)
			return true;
		if(n != 59 && n%59==0)
			return true;
		if(n != 61 && n%61==0)
			return true;
		if(n != 67 && n%67==0)
			return true;
		if(n != 71 && n%71==0)
			return true;
		if(n != 73 && n%73==0)
			return true;
		if(n != 79 && n%79==0)
			return true;
		if(n != 83 && n%83==0)
			return true;
		if(n != 89 && n%89==0)
			return true;
		if(n != 97 && n%97==0)
			return true;
		if(n != 101 && n%101==0)
			return true;
		return false;
	}

	//This Function checks if a number is a prime or not
	public static boolean isPrime(long n){
		//OIf Optimization Available, then dont go to loop
		if(optimize(n)) return false;

		boolean ret = false;
		//O(N)
		// for (long i = 2; i <= n / 2; ++i) {
		// 	if (n % i == 0) {
		// 		ret = true;
		// 		break;
		// 	}
		// }

		//O(sqrt(N))
		long i = 2;
		while(i*i <= n){
			if(n%i == 0){
				ret = true;
				break;
			}	
			i++;
		}
		return !ret;
	}

	public static void leftRightSimultaneousPass(long N){
		//Copy Variables to prevent changing the original
		long ln = N;
		long rn = N;

		//These Variables store the Left Prime & the Right Prime (smaller, greater)
		long L = 0;
		long R = 0;

		//Decrementer
		while(true){
			if(isPrime(--ln)){
				L = ln;
				if(L <= 2)
					L = -1;
				break;
			}
		}

		//Incrementer
		while(true){
			if(isPrime(++rn)){
				R = rn;
				if(R < 2)
					R = 2;
				break;
			}
		}

		System.out.println("(LRSP) Closest Smaller Prime Number: " + (L == -1 ? "None" : L));
		System.out.println("(LRSP) Closest Greater Prime Number: " + (R == -1 ? "None" : R));
	}

	public static void iterativePass(int N){
		int G = 0;
			int S = 0;
			for(int i=0; i< N + 100; i++){
				if(isPrime(i)){
					if(i > N+1){
						G = i;
						break;
					}else if(i < N-1){
						S = i;
					}
					
				}
			}
		System.out.println("(IP) Closest Smaller Prime Number: " + (S == 0 ? "None" : S));
		System.out.println("(IP) Closest Greater Prime Number: " + (G == 0 ? "None" : G));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\nEnter the number (or 'x' to exit): ");
			String inp = sc.nextLine().trim();
			if(inp.equalsIgnoreCase("x"))
				break;
			long N = Long.parseLong(inp);
			leftRightSimultaneousPass(N);
			// iterativePass(N);
			//closest lesser
			sc.reset();
		}
		sc.close();
	}
}
