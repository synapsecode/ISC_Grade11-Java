//Program-19
package MatrixPrograms;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.println();
		int mat[][] = new int[n][n];
		int transmat[][] = new int[n][n];
		// Accepting
		boolean is_symmetric = true;
		System.out.println("Enter Elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Adding Data
				mat[i][j] = sc.nextInt();
				transmat[j][i] = mat[i][j];
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (is_symmetric) {
				for (int j = 0; j < n; j++) {
					if (mat[i][j] != transmat[i][j]) {
						is_symmetric = false;
						break;
					}
				}
			} else
				break;
		}

		if (is_symmetric)
			System.out.println("Symmetric Matrix");
		else
			System.out.println("Unsymmetric Matrix");

		sc.close();
	}
}
