package algorithms;

public class RecursiveFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		
	}
	
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
