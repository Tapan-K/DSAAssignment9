package in.ineuron.assignment9;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false; // Zero and negative numbers are not powers of two
		}

		while (n > 1) {
			if (n % 2 != 0) {
				return false; // If there is any remainder when dividing by 2, n is not a power of two
			}
			n = n / 2;
		}

		return true;
	}

	public static void main(String[] args) {
		// Question 1
		int n1 = 1;
		System.out.println(isPowerOfTwo(n1)); // Output: true

		int n2 = 16;
		System.out.println(isPowerOfTwo(n2)); // Output: true

		int n3 = 3;
		System.out.println(isPowerOfTwo(n3)); // Output: false

	}

}
