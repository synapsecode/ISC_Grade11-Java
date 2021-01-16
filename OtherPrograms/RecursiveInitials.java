//PROGRAM-35
package OtherPrograms;
import java.util.Scanner;

class RecursiveInitials{
	public static void recursiveInitials(String s, int pos){
        if(pos == 1) s = " "+s; //Prefilling space to add first name initial
        if(pos > s.length()-1) return; //prevent IndexOutofBounds
        char prev = s.charAt(pos-1);
        char cur = s.charAt(pos);
        if(prev == ' '){
            System.out.print(cur);
            if(pos-1 != s.lastIndexOf(" ")) System.out.print("."); //Prevent Last Dot
        }
        recursiveInitials(s, pos+1);
    }

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String text = sc.nextLine();
		recursiveInitials(text, 1);
		sc.close();
	}
}