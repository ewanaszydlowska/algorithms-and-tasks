package varied;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreatePalindrome {

	public static void main(String[] args) {

		int num1 = 73327;
		int num2 = 27997;
		String palindrome = CreatePalindrome.createPalindrome(num1, num2);
		System.out.println(palindrome);
		System.out.println(CreatePalindrome.isPalindrome(palindrome));
		System.out.println(CreatePalindrome.palindromeMultipliers(palindrome).toString());

	}

	public static String createPalindrome(int num1, int num2) {
		// check if given numbers are 5-digit prime
		if (isNumberCorrect(num1) != true || isNumberCorrect(num2) != true)
			return "Given numbers are incorrect";

		// check if creating palindrome is possible
		String numberString = Integer.toString(num1) + Integer.toString(num2);
		char[] numbers = numberString.toCharArray();
		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length - 2;) {
			if (numbers[i] == numbers[i + 1])
				i = i + 2;
			else
				return "Palindrome cannot be created";
		}

		// create palindrome
		StringBuilder sb = new StringBuilder();
		for (char c : numbers) {
			sb.append(c);
		}
		List<Character> numbersList = sb.toString().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> halfNumbers = new ArrayList<>();

		for (int i = 0; i < numbersList.size(); i += 2) {
			halfNumbers.add(numbersList.get(i));
		}

		StringBuilder sb2 = new StringBuilder();
		for (char c : halfNumbers)
			sb2.append(c);

		String halfPalindrome = sb2.toString();
		return new StringBuilder(halfPalindrome).reverse().toString() + halfPalindrome;
	}

	public static boolean isNumberCorrect(int num) {
		if (num <= 10001 && num >= 99991)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	public static boolean isPalindrome(String palindrome) {
		return palindrome.equals(new StringBuilder(palindrome).reverse().toString());
	}

	public static Map<Long, Long> palindromeMultipliers(String palindrome) {
		Map<Long, Long> multipliers = new HashMap<>();
		long palindomeVal = Long.parseLong(palindrome);
		double sqrt = Math.sqrt(palindomeVal);
		multipliers.put(1l, palindomeVal);

		for (long i = 2; i < sqrt; i++) {
			if (palindomeVal % i == 0)
				multipliers.put(i, palindomeVal / i);
		}

		long chceckSqrt = (long) sqrt;
		multipliers.put(chceckSqrt, chceckSqrt);

		return multipliers;
	}
}
