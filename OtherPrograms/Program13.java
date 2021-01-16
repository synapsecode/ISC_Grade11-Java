/*
PROGRAM-13
*/
package OtherPrograms;
import java.util.Scanner;
class Program13{

	public static String[] customSort(String[] arr){
		//!Yet to implement
		//!Sort by length, if equal sort alphabetically
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String sentence = sc.nextLine().trim();
		String S = sentence;
		sentence = sentence.toUpperCase();
		//Checking for EOS(End of Sentence) Valididity
		char eos = sentence.charAt(sentence.length() - 1);
		if(eos == '.' || eos == '?' || eos == '!'){
			String[] words = sentence.split(" ");
			//Custom Sorting
			words = customSort(words);
			String output = "";
			for(int i=0; i<words.length; i++)
				output += words[i] + " ";
			//Display
			System.out.println("Input: " + S);
			System.out.println("Output: " + output.trim());

		}else{
			System.out.println("Invalid End Of Sentence");
		}
		sc.close();
	}
}