package varied;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(createPalindrome());
	}

	public static String createPalindrome() {
		List<Integer> list = primeNumbers();
		long product = 0, max = 0, a = 0, b = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				product = list.get(i) * list.get(j);
				if (product > 2000000000)
				System.out.println(product);
				if (isPalindrome(Long.toString(product))) {
					if (product > max) {
						max = product;
						a = list.get(i);
						b = list.get(j);
					}
				}
			}
		}
		return "largest palindrome: " + max + " = " + a + " * " + b;
	}

	public static List<Integer> primeNumbers() {
		List<Integer> primeNumbers = new ArrayList<>();
		for (int i = 10001; i <= 99991; i++) {
			if (isPrime(i))
				primeNumbers.add(i);
		}
		return primeNumbers;
	}

	public static boolean isPrime(int n) {
		int maxIteration = (int) Math.ceil(Math.sqrt(n));
		for (int i = 2; i < maxIteration; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPalindrome(String palindrome) {
		return palindrome.equals(new StringBuilder(palindrome).reverse().toString());
	}
}
