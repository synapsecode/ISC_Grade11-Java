//Program-26
package OtherPrograms;

import java.util.Scanner;

public class SaddlePoint {
	static boolean findSaddlePoint(int mat[][])
    {
		int n = mat.length;

        // Process all rows one by one
        for (int i = 0; i < n; i++)
        {
            // Find the minimum element of row i.
            // Also find column index of the minimum element
            int min_row = mat[i][0], col_ind = 0;
            for (int j = 1; j < n; j++)
            {
                if (min_row > mat[i][j])
                {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
      
            // Check if the minimum element of row is also
            // the maximum element of column or not
            int k;
            for (k = 0; k < n; k++)
      
                // Note that col_ind is fixed
                if (min_row < mat[k][col_ind])
                    break;
      
            // If saddle point is present in this row then
            // print it
            if (k == n)
            {
               System.out.println("Value of Saddle Point " + min_row);
               return true;
            }
        }
      
        // If Saddle Point not found
        return false;
	}
	
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
		if(!findSaddlePoint(mat)){
			System.out.println("No Saddle Point in the Matrix");
		}
		sc.close();
	}
}
