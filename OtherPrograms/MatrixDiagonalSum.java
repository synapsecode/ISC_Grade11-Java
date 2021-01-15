/*
PROGRAM-16
*/
package OtherPrograms;

import java.util.Scanner;

public class MatrixDiagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		System.out.println("Enter Elements:");
		int pds = 0, rds = 0;
		//Accepting
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mat[i][j] = sc.nextInt();
				if(i==j)
					pds += mat[i][j];
				if(i+j == n-1)
					rds += mat[i][j];
			}
		}

		System.out.println("Sum of Principal Diagonal: " + pds);
		System.out.println("Sum of Right Diagonal: " + rds);
		sc.close();
	}
	
}
