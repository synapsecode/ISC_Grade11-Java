/*
PROGRAM-14
PrimeMatrix: Fill NxN grid with Prime numbers
*/
package MatrixPrograms;
import java.util.Scanner;
import Common.SharedFunctions;

public class PrimeMatrix extends SharedFunctions{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N Value: ");
		int N = sc.nextInt();

		int[][] grid = new int[N][N];

		//Get primes and fill simultaneously
		int r = 0, c = 0, i=2, cnt=0;
		int lim = N-1;
		
		while(true){
			if(cnt == N*N) break;
			if(isPrime(i)){
				grid[r][c] = i;
				cnt++;
				if(c == lim){
					c = 0;
					r++;
				} else{
					c++;
				}
			}
			i++;
		}

		//Printing
		printMatrix(grid, "\t");
		sc.close();
	}
}
