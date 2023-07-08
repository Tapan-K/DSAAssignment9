package in.ineuron.assignment9;

public class FactorialOfNQ3 {
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// Question 3
		int n1 = 5;
		System.out.println("Factorial of " + n1 + ": " + factorial(n1));

		int n2 = 4;
		System.out.println("Factorial of " + n2 + ": " + factorial(n2));

	}

}
//// Output: 120
//Output: 24
