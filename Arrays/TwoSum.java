import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

//		Given an array of integers and a target sum, find two numbers that add up to the target.
//		Return their indices.
		int[] array = { 2, 5, 3, 14, 9 };
		int sum = 14;
		int[] result = twoSum(array, sum);
		int[] result2 = twoSum2(array, sum);
		int[] result = twoSum3(array, sum); //using stream API

		for (int i : result2) {
			System.out.print(i + " ");
		}
	}

	private static int[] twoSum2(int[] arr, int sum) {
//		using HashMap solution can solve this in O(n) time
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = sum - arr[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}

	private static int[] twoSum(int[] array, int sum) {
//		two-pointer technique approach
//		below solution will alter the index as it got sorted time taken O(nlogn) + O(n)
		int[] arr = Arrays.copyOf(array, array.length); // to avoid altering input
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				return new int[] { left, right };
			} else if (arr[left] + arr[right] > sum) {
				right -= 1;
			} else
				left += 1;
		}
		return new int[] {};
	}

	private static int[] twoSum3(int[] array, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		return IntStream.range(0, array.length).filter(i -> {
			int complement = sum - array[i];
			if (map.containsKey(complement)) {
				return true;
			}
			map.put(array[i], i);
			return false;
		}).mapToObj(i -> new int[] { map.get(sum - array[i]), i }).findFirst().orElse(new int[] {});
	}
}
