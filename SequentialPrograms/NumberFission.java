package SequentialPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFission {
	
	//This Function Checks for Anagrams -> 123 & 321 -> True
	static boolean checkAnagram(String s1, String s2) {
		String[] x1 = s1.split(" "); String[] x2 = s2.split(" ");
		if (s1.length() != s2.length())
			return false;
		Arrays.sort(x1); Arrays.sort(x2);
		for (int i = 0; i < x1.length; i++) {
			if (!x1[i].equals(x2[i]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = new String[5000];
		System.out.print("Enter the Number: ");
		int N = sc.nextInt();
		int c = 0;
		System.out.println("All Possible Combinations are:");
		String T;
		for (int i = 1; i < N; i++) {
			for (int j = (i == 1) ? 1 : 2; j < N; j++) {
				int r = (N - i - j);
				if(r >= 0){
					
					T = String.format("%s %s%s", i, new String(new char[r]).replace("\0", "1 "), j);
					S[c] = T;

					//Removing Duplicates
					for(int k=0; k<c; k++){
						if(T.equals(S[k]))
							continue;
						if(checkAnagram(T, S[k]))
							S[c] = "X";
					}

					String number = S[c];
						if (!number.startsWith("1 ")) {
							if (number.contains("1 ")) {
								S[c] = number.substring(number.split(" ")[0].length() + 1) + " "
										+ number.substring(0, number.split(" ")[0].length());
							}
						}

					c++;
				}
			}
		}

		String[] NS = new String[c];
		for(int i=0; i<c; i++)
			NS[i] = S[i];

		Arrays.sort(NS); //!Custom Sorting FUnction Needed

		for(int i=0; i<NS.length; i++){
			//System.out.println(S[i]);
			if(!NS[i].equals("X"))
				System.out.println(NS[i]);
		}

		S = null;

		sc.close();
	}

}
