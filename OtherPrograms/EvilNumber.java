/*
PROGRAM-9
Evil Number: A Non Negative Number which has even number of 1s in Binary Representation
*/
package OtherPrograms;
import java.util.Scanner;
public class EvilNumber {
	static String decimal2Binary(int n){
		String x="", bin = "";
		while(n>0){ x += n%2; n /= 2; }
		//Reversing x
		for (int i = 0; i < x.length(); i++) bin = x.charAt(i) + bin;
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int N = sc.nextInt();
		String binary = decimal2Binary(N);
		int cnt = 0;
		for(int i=0; i<binary.length();i++){
			if(binary.charAt(i) == '1')
				cnt++;
		}
		if(cnt%2 == 0)
			System.out.println(N + " is an Evil Number");
		else
			System.out.println(N + " is not Evil Number");
		sc.close();
	}
}
