package takeUforward.Patterns;

import java.util.Arrays;

public class ArrayMediumProblem {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 2, 3 };
		int key = 5;

		// Two Sum : Check if a pair with given sum exists in Array
		twoSumInArray(arr, key);
	}

	private static void twoSumInArray(int[] arr, int key) {
//		int[] result = new int[2];
//		for (int i = 0; i < arr.length - 1; i++) {
//			for(int j=i+1; j< arr.length; j++) {
//				if(arr[i]+ arr[j] == key) {
//					result[0] = i;
//					result[1] = j;
//				}
//			}
//		}
//		for (int i : result) {
//			System.out.println(i);
//		}

		// two pointer approach
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum < key) {
				left++;
			} else if (sum == key) {
				System.out.println("indexes are " + left + " and " + right);
				break;
			} else
				right--;
		}

	}

}
