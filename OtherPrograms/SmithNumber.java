/*
PROGRAM-4
Smith number is a number whose sum of digits of prime factors = number itself
Eg: 4 = 2+2, 22, 27 etc
*/
package OtherPrograms;
import java.util.Scanner;
public class SmithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int nn = n;
		int num = n;

		int acc = 0;

		//prime factorization
		for(int i=2; i<n; i++){
			while(n%i==0){
				int z = i;
				while(z>0){ acc += z%10; z = z/10; } //DigitExtractoAccumulate
				n /= i;
			}
		}
		if(n >2) {
			while(n>0){ acc += n%10; n = n/10; } //DigitExtractoAccumulate
		} //Get the last prime factor

		int SoD = 0;
		while(num>0){ SoD += num%10; num = num/10; } //Aggregating sum of digits of num

		if(acc == SoD)
			System.out.println(nn + " is a Smith number");
		else 
			System.out.println(nn + " is not a Smith Number");
		
		sc.close();
	}
}
