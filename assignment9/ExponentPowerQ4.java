package in.ineuron.assignment9;

public class ExponentPowerQ4 {
	public static double calculateExponent(double N, double P) {
		return Math.pow(N, P);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double N1 = 5;
		double P1 = 2;
		System.out.println(N1 + " raised to the power " + P1 + ": " + calculateExponent(N1, P1));

		double N2 = 2;
		double P2 = 5;
		System.out.println(N2 + " raised to the power " + P2 + ": " + calculateExponent(N2, P2)); // Output: 32.0

	}

}

// Output: 25
//Output: 32
