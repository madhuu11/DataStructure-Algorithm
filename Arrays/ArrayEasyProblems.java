package takeUforward.Patterns;

import java.util.Arrays;

public class ArrayEasyProblems {

	public static void main(String[] args) {
		int[] intArray = {1, 14, 6, 7, 8};

//		Largest Element in Array
		largestElement(intArray);

//		Second largest element in an array
		secondLargestElement(intArray);
		
//		Check if Array Is Sorted and Rotated
		System.out.println(isArraySortedRotated(intArray));
		
//		find the missing element in an array
		findMissingElement();
		
	}

	private static void findMissingElement() {
		int[] arr = {1,2,4,5,6};
		int n= arr.length+1, sum=0;
		int total= (n*(n+1))/2;
		for (int i : arr) {
			sum+=i;
		}
		int missingNo = total-sum;
		System.out.println("the missing element in an array is : "+missingNo);
	}

	public static boolean isArraySortedRotated(int[] nums) {
		int count = 0;
		int n = nums.length;
		if (nums[0] < nums[n - 1]) {
			count++;
		}
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}
		return true;

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
