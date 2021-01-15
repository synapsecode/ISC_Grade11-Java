package OtherPrograms;

public class SharedFunctions {
	public static boolean isVowel(char x) {
		String z = "AEIOUaeiou";
		return (z.indexOf((x + "")) != -1);
	}

	public static boolean isPalindrome(int n) {
		String s = n + "";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		return rev.equals(s);
	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0)
				return false;
			i++;
		}
		return (n == 1) ? false : true;
	}

	static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return arr;
	}
}
