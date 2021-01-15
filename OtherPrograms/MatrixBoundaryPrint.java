//Program-18
package OtherPrograms;

import java.util.Scanner;

public class MatrixBoundaryPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Columns: ");
		int c = sc.nextInt();
		System.out.println();
		int mat[][] = new int[r][c];
		//Accepting
		System.out.println("Enter Elements: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				//Adding Data
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatrix Boundary: ");

		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				//BoundarySummation
				if(i==0 || i==r-1)
					System.out.print(mat[i][j] + "\t");
				else if((j==0 || j==r-1) && !(i==0 || i==r-1))
					System.out.print(mat[i][j] + "\t");
				else
					System.out.print("  \t");

			}
			System.out.println();
		}
		sc.close();
	}
}
