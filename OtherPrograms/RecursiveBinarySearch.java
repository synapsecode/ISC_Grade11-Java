//Package-38
package OtherPrograms;

import java.util.Scanner;

public class RecursiveBinarySearch {
	static int recursiveBinarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return recursiveBinarySearch(arr, l, mid - 1, x);

			return recursiveBinarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	static int recursiveBinarySearch(int arr[], int e){
		return recursiveBinarySearch(arr, 0, arr.length, e);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		System.out.println("Enter Sorted Array Elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Element to Search: ");
		int s = sc.nextInt();
		int index = recursiveBinarySearch(arr, s);
		System.out.println();
		if(index == -1)
			System.out.println(s+" is not present in Array");
		else
			System.out.println(s+" is present at index: " + index);
		sc.close();
 	}
}
