/*
PROGRAM-15
Transpose A Matrix
*/
package MatrixPrograms;
import java.util.Scanner;
import Common.SharedFunctions;
public class MatrixTranspose extends SharedFunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Columns: ");
		int c = sc.nextInt();
		int[][] mat = new int[r][c];
		int[][] transmat = new int[c][r];

		System.out.println("Enter Elements:");
		//Accepting
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				mat[i][j] = sc.nextInt();
				transmat[j][i] = mat[i][j];	
			}
		}
		//Printing
		System.out.println("\nOriginal Matrix: ");
		printMatrix(mat, " ");

		System.out.println("\nTransposed Matrix");
		//Printing
		printMatrix(transmat, " ");
		System.out.println();

		sc.close();
	}
}
