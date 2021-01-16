/*
PROGRAM-8
KeithNumber - 197 present in sequence hence it is keith
eg: 197(3Digits) - (1 + (9 + (7) + (17) + (33) + 57) + 107) = 197
Start: 1 + 9 + 7

*/

package SpecialNumbers;
import java.util.Scanner;

public class KeithNumber {

	public static boolean isKeithNumber(int n){
		boolean isKeith = false;
		int d = (n+"").length();
		int[] register = new int[d]; //Stores n values as fixed register
		//Filling Register with individual digits
		int nn = n; int ctr = d-1;
		while(nn > 0){
			register[ctr] = nn%10;
			ctr--; //To get Reversed eg: [1][4] instead of [4][1]
			nn /= 10;
		}

		boolean halt = false;
		while(!halt){
			int acc = 0;
			for(int i=0; i<d; i++){
				acc += register[i];
				if(i == (d-1)){
					register[i] = acc;
					if(register[i] > n){
						halt = true;
						isKeith = false;
						break;
					}
					if(register[i] == n){
						halt = true;
						isKeith = true;
						break;
					}
				}else{
					register[i] = register[i+1];
				}
			}
		}

		return isKeith;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a Keith Number: ");
		int N = sc.nextInt();
		if(isKeithNumber(N))
			System.out.println(N + " is a Keith Number");
		else
			System.out.println(N + " is not a Keith Number");
		sc.close();
	}
}
