//Program-20
package OtherPrograms;

import java.util.Scanner;

public class MatrixColumnReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Columns: ");
		int c = sc.nextInt();
		System.out.println();
		int mat[][] = new int[r][c];
		int revmat[][] = new int[r][c];
		//Accepting
		System.out.println("Enter Elements: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				//Adding Data
				mat[i][j] = sc.nextInt();
				revmat[c-i-1][j] = mat[i][j];
			}
		}
		System.out.println("\nOriginal Matrix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nColumn Reversed Matrix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(revmat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
