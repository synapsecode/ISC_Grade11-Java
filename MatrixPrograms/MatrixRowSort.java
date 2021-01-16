//Program 21
package MatrixPrograms;

import java.util.Scanner;
import Common.SharedFunctions;

public class MatrixRowSort extends SharedFunctions {
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

		System.out.println("\nOriginal Matrix:");
		printMatrix(mat, " ");

		System.out.println("\nRowSortedMatrx");
		for(int i=0; i<r; i++)
			mat[i] = bubbleSort(mat[i]);
			
		printMatrix(mat, " ");
		sc.close();

	}
}
