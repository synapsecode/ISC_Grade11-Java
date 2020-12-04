package ArrayPrograms;
import java.util.Scanner;

public class InsertionSort {
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
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elemenents: ");
		int n = sc.nextInt();
		System.out.println("Enter the Numbers one by one: ");
		
		int[] A = new int[n];

		for(int i=0; i<n; i++)
			A[i] = sc.nextInt();

		//Perform sort
		A = insertionSort(A);

		for(int i=0; i<n; i++)
			System.out.print(A[i] + " ");
		
		sc.close();
		
	}
}
