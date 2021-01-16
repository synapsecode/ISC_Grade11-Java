//Program22
package MatrixPrograms;

import java.util.Scanner;

public class ScalarMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.println();
		int mat[][] = new int[n][n];
		// Accepting
		System.out.println("Enter Elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Adding Data
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int val = 0;
		boolean isScalar = true;
		for (int i = 0; i < n; i++) {
			if(isScalar)
				for (int j = 0; j < n; j++) {
					int V = mat[i][j];
					if(i==j){
						if(i==0) val = V;
						if(V != val){
							isScalar = false;
							break;
						}
					}else{
						if(V != 0){
							isScalar = false;
							break;
						}
					}
				}
			else
				break;
		}

		if(isScalar)
			System.out.println("\nScalar Matrix");
		else
			System.out.println("\nNot a Scalar Matrix");

		sc.close();
	}
}
