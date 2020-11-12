package SequentialPrograms;
import java.util.Scanner;

public class PseudoArtihmeticSeries {
	int n; //Size of Sequence
	int a[]; //Store numbers
	boolean flag; //flag if series is PseudoArtihmetic
	int ans; //sum
	int r; //store sum of the 2 numbers;

	static Scanner sc = new Scanner(System.in);

	PseudoArtihmeticSeries(){
		n = 0;
		a = new int[0];
		flag = false;
		r = -1;
	}

	boolean check(){
		int rr = 0;
		for(int i=0; i<n; i++){
			if(i==(n/2 + 1)) break;
			// System.out.println(a[i] + " " + a[n-i-1]);
			rr = a[i] + a[n-i-1];
			if(r == -1)
				r = rr;
			else if(r == rr)
				flag = true;
			else if(r != rr){
				flag = false;
				break;
			}
		}
		ans = (n/2)*r;
		return flag;
	}

	void accept(int num){
		a = new int[num];
		n = num;
		System.out.println("Enter the numbers: ");
		//Filling Integer Array
		for(int i=0; i<num; i++) a[i] = Integer.parseInt(sc.next().trim());
	}

	public static void main(String[] args){
		System.out.print("Enter number of elements: ");
		int num = Integer.parseInt(sc.nextLine().trim());
		PseudoArtihmeticSeries obj = new PseudoArtihmeticSeries();
		obj.accept(num);
		boolean f = obj.check();
		if(f){
			System.out.println("Pseudo-Artihmetic Series");
			System.out.println("Sum: " + obj.ans);
		}else{
			System.out.println("Not a Pseudo-Artihmetic Series");
		}
		sc.close();
	}
}