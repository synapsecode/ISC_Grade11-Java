package StringPrograms;
import java.util.Scanner;

public class CyclopsNumber {
	static String convertBinary(int num){
		if(num==0)
			return "0";
		String binrep = "";
		int binary[] = new int[40];
		int index = 0;
		while(num > 0){
		  binary[index++] = num%2;
		  num = num/2;
		}
		for(int i = index-1;i >= 0;i--){
		  binrep += (binary[i]);
		}
		return binrep;

		//or use .toBinaryString();
	 }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		String bin = convertBinary(n);

		char middle = n%2==0 ? bin.charAt(n/2) : bin.charAt((n/2) + 1);

		if(middle == '0')
			System.out.println("Cyclops Number");
		else
			System.out.println("Not a Cyclops Number");

		sc.close();
	}
}
