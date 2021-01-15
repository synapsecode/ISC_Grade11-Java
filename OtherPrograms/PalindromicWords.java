/*
PROGRAM-2
WAP to accept String Sentence and find all palindromes and its frequency.
*/
package OtherPrograms;
import java.util.Scanner;
public class PalindromicWords {
	static boolean isPalindrome(String x){
		int n = x.length()-1;
		for(int i=0; i<n; i++){ if(x.charAt(i) != x.charAt(n-i)) return false; }
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String s = sc.nextLine().trim().toUpperCase();

		//Removing Punctuation
		s = s.replace(",", "").replace(".", "");
		String[] words = s.split(" ");
		String[] palindromes = new String[words.length];

		//Identifying Palindromes
		int pc = 0;
		for (int i = 0; i < words.length; i++) {
			if(isPalindrome(words[i])){
				palindromes[pc] = words[i];
				pc+=1;
			}
		}
		
		System.out.println("Frequency of Palindromic Words in Sentence: ");
		for (int i = 0; i < pc; i++) {
			if(palindromes[i].equals("~")) continue; //Skip Visited Values
			int cnt = 0;
			for(int j=0; j<pc; j++){
				if(palindromes[i].equals(palindromes[j])){
					cnt+=1;
					if(j!=i) palindromes[j] = "~"; //To mark Visited
				}
			}
			System.out.println(palindromes[i] + " | " + cnt);
		}
		sc.close();
	}
}
