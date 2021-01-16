//Program-46
package StringPrograms;
import java.util.Scanner;

//aabbccdefaaag => a2b2c2defa3g
public class RunLengthEncoding {
	static String RLE(String s){
		String encoded = "";
		char ch_cache = '\0';
		int ctr=1;
		for(int i=0; i<=s.length(); i++){
			char ch;
			if(i==s.length()){
				//RL Encode the last character (usually as it gets missed out in the loop)
				encoded += "" + ((ctr>1) ? ctr : "");
			}else{
				ch =  s.charAt(i);
				if(ch_cache == ch){ //Cached Value
					ch_cache = ch;
					ctr+=1;
				}else{ //New Value
					if(ctr>1 && ch_cache != '\0') encoded +=  "" + ctr;
					encoded += ch+"";
					ch_cache = ch;
					ctr = 1;
				}
			}
		}
		return encoded;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("\nEnter the String (or 'x' to Exit): ");
			String s = sc.nextLine().trim();
			if(s.equalsIgnoreCase("x")) break;
			String encoded_sentence = "";
			for(String x : s.split(" ")){
				encoded_sentence += RLE(x) + " ";
			}
			System.out.println("RL Encoded String: " + encoded_sentence);
		}
		sc.close();
	}
}
