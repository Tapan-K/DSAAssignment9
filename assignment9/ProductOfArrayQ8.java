package in.ineuron.assignment9;

public class ProductOfArrayQ8 {
	 public static long calculateProduct(int[] arr) {
	        long product = 1;
	        for (int i = 0; i < arr.length; i++) {
	            product *= arr[i];
	        }
	        return product;
	    }

	public static void main(String[] args) {
		// Question 8
		int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Product of array elements: " + calculateProduct(arr1)); 

        int[] arr2 = {1, 6, 3};
        System.out.println("Product of array elements: " + calculateProduct(arr2)); 

	}

}

//Output: 120
//Output: 18
