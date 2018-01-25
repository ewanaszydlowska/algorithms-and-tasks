package algorithms;

public class RecursivePalindrome {

	public static void main(String[] args) {
		String str = "acbca";
		System.out.println(isPalindrome(str));
	}
	
	static boolean isPalindrome(String str) {
		if (str.length() <= 1) 
			return true;
		if (!str.substring(0, 1).equals(str.substring(str.length() -1)))
			return false;
		return isPalindrome(str.substring(1, str.length() - 1));
	}
}
