//Program-53
package ArrayPrograms;

import java.util.Scanner;

/*
SDA a[n]  DDA b[n][n]
Sort the elements of a[n] with Insertion Sort, then arrange its elements in b[n][n] as follows
row 0: all
row 1: (all - {last}) + 1st
row 2: (all - {2ndlast, last}) +1st+ 2nd
.
.
row n-1: (1st) + 1st +2nd +....+2ndlast
eg (sorted a[]=) 1,2,3,4
b[][] = 
1234
1231
1212
1123
*/
public class Single2DoubleDimension {
	static int[] insertionSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
		} 
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the Numbers one by one: ");
		
		int[] A = new int[n];

		for(int i=0; i<n; i++)
			A[i] = sc.nextInt();

		//Perform sort
		A = insertionSort(A);

		int[][] B = new int[n][n];
		for (int i = 0; i < n; i++) {
			int k = 0;
			for(int j=0; j<n-i; j++)
				B[i][j] = A[j];
			for(int x=n-i; x<n; x++){
				B[i][x] = A[k++];
			}
		}
		System.out.println("\nOutput:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}


	}
}
