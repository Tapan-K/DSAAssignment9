package in.ineuron.assignment9;

public class FindNthTermArithmaticProgQ6 {
	public static int findNthTerm(int a, int d, int N) {
		int nthTerm = a + (N - 1) * d;
		return nthTerm;
	}

	public static void main(String[] args) {
		// Question 6
		int a1 = 2;
		int d1 = 1;
		int N1 = 5;
		System.out.println("The " + N1 + "th term of the series is: " + findNthTerm(a1, d1, N1));

		int a2 = 5;
		int d2 = 2;
		int N2 = 10;
		System.out.println("The " + N2 + "th term of the series is: " + findNthTerm(a2, d2, N2));

	}

}

//Output: 6
//Output: 23
