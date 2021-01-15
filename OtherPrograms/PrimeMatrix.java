/*
PROGRAM-14
PrimeMatrix: Fill NxN grid with Prime numbers
*/
package OtherPrograms;
import java.util.Scanner;
public class PrimeMatrix extends SharedFunctions{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N Value: ");
		int N = sc.nextInt();

		int[][] grid = new int[N][N];

		//Get primes and fill simultaneously
		int r = 0;
		int c = 0;
		int lim = N-1;
		int i=2;
		int cnt = 0;
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
		for (int a = 0; a < grid.length; a++) {
			for(int b=0; b<grid.length; b++ ){
				System.out.print(grid[a][b] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
