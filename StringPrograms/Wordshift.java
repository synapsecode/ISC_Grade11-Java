//Program-28
package StringPrograms;

import java.util.Scanner;

public class Wordshift {
	public static String shiftWord(String w){
		int shift = 1;
		String w_enc = "";
		for(int j=0; j<w.length(); j++){
			//Runs on each word
			char ch = w.charAt(j);
			int asc = (int)ch;
			int newasc = 0, R1 = 0,  R2 = 0;
			if(Character.isUpperCase(ch)){ R1 = 65; R2 = 90; }
			else { R1=97; R2=122; }

			//Shifting
			if((asc + shift) <= R2)
				newasc = asc + shift;
			else
				newasc = R1 + (shift - (R2 - asc) -1); //Handles ASCII Range Overflow
				
			w_enc+=(char)newasc;
		}
		return w_enc;
	}

	public static int stringArrayIndexOf(String[] arr, String value){
		int loc = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(value)){
				loc = i;
				break;
			}
		}
		return loc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sentence = sc.nextLine().trim();
		String[] words = sentence.split(" ");
		System.out.println("Enter 2 Words from the Sentence");
		String W1 = sc.next().trim();
		String W2 = sc.next().trim();
		int loc1 = stringArrayIndexOf(words, W1);
		int loc2 = stringArrayIndexOf(words, W2);
		if(loc1 != -1 || loc2 != -1){
			words[loc1] = shiftWord(words[loc1]);
			words[loc2] = shiftWord(words[loc2]);
			//Print Array
			for (int i = 0; i < words.length; i++) System.out.print(words[i] + " ");
		}else{
			System.out.println("One of the Words does not Exist in the Sentece");
		}
		sc.close();
	}
}
