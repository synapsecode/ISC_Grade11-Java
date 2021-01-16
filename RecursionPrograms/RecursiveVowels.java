//PROGRAM-36
package RecursionPrograms;
import java.util.Scanner;

public class RecursiveVowels {
	public static boolean isVowel(char x){
        String z = "AEIOUaeiou";
        return (z.indexOf((x+"")) != -1);
    }
    
    public static int vowelCount(String s, int count, int pos){
		//Handle Last Position
        if(pos==s.length()-1)
			return isVowel(s.charAt(pos)) ? count+1 : count;
        return vowelCount(s, ((isVowel(s.charAt(pos))) ? count+1 : count), pos+1);
    }

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Text: ");
		String text = sc.nextLine();
		System.out.println("Text Contains " + vowelCount(text, 0, 0) + " Vowels");
		sc.close();
	}
}
