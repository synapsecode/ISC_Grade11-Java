/*
PROGRAM-3
display(String str, char ch) -> if ch in front of str => Special word else not
display(String st1, String st2) -> .equals
display(String str1, int n) -> Prints character at nth Position
WAP & Main method for this.
*/
package OtherPrograms;

public class OverloadingExample {
	void display(String str, char ch){
		//To Maintain Case
		ch = Character.toUpperCase(ch);
		str = str.toUpperCase();

		if(str.charAt(0) == ch)
			System.out.println("Special Word");
		else
			System.out.println("Not a Special Word");
	}

	void display(String st1, String st2){
		if(st1.equals(st2))
			System.out.println("They are Equal");
		else
			System.out.println("They are not Equal");
	}

	void display(String str1, int n){
		System.out.println(str1.charAt(n)+"");
	}

	public static void main(String[] args) {
		OverloadingExample cls = new OverloadingExample();
		cls.display("Manas", 'M'); //Special Word
		cls.display("Sapien", "Sapien"); //They are Equal
		cls.display("Java", 2); //v
	}
}
