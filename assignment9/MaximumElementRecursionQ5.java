package in.ineuron.assignment9;

public class MaximumElementRecursionQ5 {
	public static int findMaxElement(int[] arr, int startIndex, int endIndex) {

		if (startIndex == endIndex) {
			return arr[startIndex];
		}

		int midIndex = (startIndex + endIndex) / 2;
		int maxLeft = findMaxElement(arr, startIndex, midIndex);
		int maxRight = findMaxElement(arr, midIndex + 1, endIndex);

		return Math.max(maxLeft, maxRight);
	}

	public static void main(String[] args) {
		// Question 5
		int[] arr1 = { 1, 4, 3, -5, -4, 8, 6 };
		System.out.println("Maximum element of the array: " + findMaxElement(arr1, 0, arr1.length - 1));

		int[] arr2 = { 1, 4, 45, 6, 10, -8 };
		System.out.println("Maximum element of the array: " + findMaxElement(arr2, 0, arr2.length - 1));

	}

}

//Output: 8
//Output: 45
