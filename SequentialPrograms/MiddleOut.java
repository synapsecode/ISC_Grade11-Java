package SequentialPrograms;

import java.util.Scanner;
import java.util.Arrays;

public class MiddleOut {

	static int[] reverse(int a[]) 
	{ 
		int n = a.length;
		int i, t; 
		for (i = 0; i < n / 2; i++) { 
			t = a[i]; 
			a[i] = a[n - i - 1]; 
			a[n - i - 1] = t; 
		} 

		return a;
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number of elements ('x' to Exit): ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");

		//Inputing elements
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		//sort array
		Arrays.sort(arr); 

		//Calculating partition lenghts
		int lhn, rhn;
		if(n%2==0){
			//even number of elements => [n/2 - 1] 0 [n/2]
			lhn = (n/2) - 1;
			rhn = n/2;
		}else{
			//Odd number of elements => [n/2]-0-[n/2]
			lhn = n/2;
			rhn = n/2;
		}
		
		//Creating default Partition arrays
		int[] LH = new int[lhn];
		int[] RH = new int[rhn];

		//left-hand & right-hand counters
		int lhc=0, rhc=0;

		//Filling Partitions [start from index 1 as index 0 is middle]
		for(int i=1; i<n; i++){
			if(i%2 == 0){
				//even index in arr
				LH[lhc] = arr[i];
				lhc++;
			}else{
				//odd index in arr
				RH[rhc] = arr[i];
				rhc++;
			}
		}

		//Reverse the left hand side
		LH = reverse(LH);

		//Printing
		String output = "";
		for(int i=0; i<lhn; i++)
			output += (LH[i] + " "); //Left hand side
		output += arr[0] + " "; //Smallest, Center element
		for(int i=0; i<rhn; i++)
			output += (RH[i] + " "); //Right hand side

		System.out.println("\nResult: " + output.trim());
		sc.close();
	}
}
