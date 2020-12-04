package SequentialPrograms;
import java.util.Scanner;

public class NearestPrime {
	public static boolean isPrime(long n){
		boolean ret = false;

		//O(N/2) Approach
		// for (long i = 2; i <= n / 2; ++i) {
		// 	if (n % i == 0) {
		// 		ret = true;
		// 		break;
		// 	}
		// }

		//O(sqrt(N)) Approach
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
				if(L+1 <= 2) L = -1;
				break;
			}
		}

		//Incrementer
		while(true){
			if(isPrime(++rn)){
				R = rn;
				if(R < 2) R = 2;
				break;
			}
		}

		System.out.println("(LRSP) Closest Smaller Prime Number: " + (L == -1 ? "None" : L));
		System.out.println("(LRSP) Closest Greater Prime Number: " + (R == -1 ? "None" : R));
	}

	public static void iterativePass(long N){
		long G = 0;
			long S = 0;
			for(long i=0; i< N + 100; i++){
				if(isPrime(i)){
					if(i > N){
						G =  i == 1 ? 0 : i;
						break;
					}else if(i < N){
						S = i == 1 ? 0 : i;
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
			iterativePass(N);
			//closest lesser
			sc.reset();
		}
		sc.close();
	}
}
