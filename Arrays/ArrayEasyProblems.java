package takeUforward.Patterns;

import java.util.Arrays;

public class ArrayEasyProblems {

	public static void main(String[] args) {
		int[] intArray = {1, 14, 6, 7, 8};

//		Largest Element in Array
		largestElement(intArray);

//		Second largest element in an array
		secondLargestElement(intArray);
	}

	private static void secondLargestElement(int[] intArray) {
		// Brute force approach
		Arrays.sort(intArray);
		int n = intArray.length;
		if(n == 0 || n == 1) {
			System.out.println(-1);
		}else {
			System.out.println(intArray[n-2]);
		}
		
		// Better approach
		int n = intArray.length;
		if(n == 0 || n == 1) {
			System.out.println(-1);
		}
		int max = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
		for(int i=0;  i<n; i++) {
			max = Math.max(max, intArray[i]);
		}
		for(int i=0;  i<n; i++) {
			if(intArray[i]>secondLarge && intArray[i]!=max) {
				secondLarge=intArray[i];
			}
		}
		System.out.println(secondLarge);
		
		// Optimal approach
		int n = intArray.length;
		if(n < 2) {
			System.out.println(-1);
		}
		int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(intArray[i] > large) {
				secondLarge = large;
				large = intArray[i];
			}
			else if(intArray[i] > secondLarge && intArray[i]!=large) {
				secondLarge = intArray[i];
			}
		}
		System.out.println(secondLarge);

	}

	private static void largestElement(int[] intArray) {
		//brute force approach
//		Arrays.sort(intArray);
//		System.out.println(intArray[intArray.length-1]);
		
		//recursive approach
		int max = intArray[0];
		for (int i: intArray) {
			if(i>max) {
				max =i;
			}
		}
		System.out.println(max);
	}

}
