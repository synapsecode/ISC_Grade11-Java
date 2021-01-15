package OtherPrograms;

public class SharedFunctions {
	public static boolean isVowel(char x){
        String z = "AEIOUaeiou";
        return (z.indexOf((x+"")) != -1);
	}
	
	public static boolean isPalindrome(int n){
		String s = n+"";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		return rev.equals(s);
	}

	public static boolean isPrime(int n){
		int i = 2;
		while(i*i <= n){
			if(n%i==0) return false;
			i++;
		}
		return (n==1) ? false : true;
	}
}
