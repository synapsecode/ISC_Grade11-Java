package StringPrograms;

import java.io.*;
public class CeasarCipher
{
	public static String ceasarEncode(String w, int shift){
		String w_enc = "";
		for(int j=0; j<w.length(); j++){
			//Runs on each word
			char ch = w.charAt(j);
			if(Character.isLetter(ch)){
				int asc = (int)ch;
				int newasc = 0;
				if(Character.isUpperCase(ch)){
					if((asc + shift) <= 90){
						newasc = asc + shift;
					}else{
						newasc = 65 + (shift - (90 - asc));
					}
				}else{
					if((asc + shift) <= 122){
						newasc = asc + shift;
					}else{
						newasc = 97 + (shift - (122 - asc));
					}
				}
				w_enc+=(char)newasc;
			}else{
				w_enc+=""+ch;
			}
		}
		return w_enc;
	}
    public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		while(true){
			String encoded = "";
			System.out.print("\nEnter the string and the shift value (or 'x' to Exit): ");
			String s = br.readLine();
			if(s.equalsIgnoreCase("x")) break;
			int x = Integer.parseInt(br.readLine());
			//x = x - 1; [Toggle for specific accuracy]

			String[] sx = s.trim().split(" ");
			for(int i=0; i<sx.length; i++){
				//Encode Each Word
				encoded += ceasarEncode(sx[i], x) + " ";
			}
			System.out.println("Encoded messsage: " + encoded);
		}
		br.close();
		ir.close();
    }
}