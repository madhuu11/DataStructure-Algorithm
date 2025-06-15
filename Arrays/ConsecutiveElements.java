import java.util.Arrays;

public class ConsecutiveElements {
	public static void main(String[] args) {
    // Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
		int[] arr = { 1, 3, 5, 4, 5, 6, 78 };
		consecutiveNo(arr);
		consecutiveNoUsingHashMap(arr);
	}

	private static void consecutiveNoUsingHashMap(Integer[] arr) {
		// O(n) time complexity
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
		int length = 1;
		for (Integer integer : set) {
			if(set.contains(integer+1)) {
				length += 1;
			}
		}
		System.out.println(length);
	}
	
	private static void consecutiveNo(int[] arr) {
		// O(nlogn) time complexity
		Arrays.sort(arr);
		int length = 0, len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				continue;
			if (arr[i] == arr[i - 1] + 1)
				len += 1;
			else
				len = 1;
			if (len > length) {
				length = len;
			}
		}
		System.out.println("The length of the consecutive element is " + length);
	}
}
