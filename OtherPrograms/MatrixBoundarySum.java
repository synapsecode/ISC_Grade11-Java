//Program-17
package OtherPrograms;

import java.util.Scanner;

public class MatrixBoundarySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Columns: ");
		int c = sc.nextInt();
		System.out.println();
		int mat[][] = new int[r][c];
		//Accepting
		int sum = 0;
		System.out.println("Enter Elements: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				//Adding Data
				mat[i][j] = sc.nextInt();

				//BoundarySummation
				if(i==0 || i==r-1)
					sum += mat[i][j];
				if((j==0 || j==r-1) && !(i==0 || i==r-1))
					sum += mat[i][j];
			}
		}
		System.out.println("\nBoundary Sum: " + sum);
	}
}
