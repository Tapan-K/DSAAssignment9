package in.ineuron.assignment9;

public class SumOfNnaturalNumQ2 {
	static int sumOfFirstNNumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	public static void main(String[] args) {
		// Question 2
		int n1 = 3;
		System.out.println("Sum of the first " + n1 + " natural numbers: " + sumOfFirstNNumbers(n1));

		int n2 = 5;
		System.out.println("Sum of the first " + n2 + " natural numbers: " + sumOfFirstNNumbers(n2));

	}

}

//// Output: 6
//// Output: 15