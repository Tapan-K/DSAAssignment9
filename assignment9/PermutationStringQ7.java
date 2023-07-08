package in.ineuron.assignment9;

import java.util.*;

public class PermutationStringQ7 {
	public static List<String> findPermutations(String str) {
		List<String> permutations = new ArrayList<>();
		backtrack(str.toCharArray(), 0, permutations);
		return permutations;
	}

	private static void backtrack(char[] arr, int index, List<String> permutations) {
		if (index == arr.length - 1) {
			permutations.add(String.valueOf(arr));
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(arr, index, i);
			backtrack(arr, index + 1, permutations);
			swap(arr, index, i);
		}
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// Question 7

		String str1 = "ABC";
		List<String> permutations1 = findPermutations(str1);
		System.out.println(permutations1); // Output: [ABC, ACB, BAC, BCA, CBA, CAB]

		String str2 = "XY";
		List<String> permutations2 = findPermutations(str2);
		System.out.println(permutations2); // Output: [XY, YX]

	}

}
