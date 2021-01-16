/*
PROGRAM-10
PIGLATIN
*/
package StringPrograms;
import java.util.Scanner;

import Common.SharedFunctions;
public class PigLatin extends SharedFunctions {

	static String makePigLatin(String s) { 
		int len = s.length(); 
		int index = -1; 
		for (int i = 0; i < len; i++) 
		{ 
			if (isVowel(s.charAt(i))) { 
				index = i; 
				break; 
			} 
		} 
		if(index == -1) return s; //If No Vowels, give back original
		return s.substring(index) + 
			   s.substring(0, index) + "ay"; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String sentence = sc.nextLine().trim();

		String[] words = sentence.split(" ");
		String encoded = "";

		//Encoding
		for(int i=0; i<words.length; i++){
			encoded += makePigLatin(words[i]) + " ";
		}
		
		System.out.println("Encoded Text: " + encoded);
		sc.close();
	}
}
