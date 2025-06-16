public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 16;
		int index = binarySearch(arr, target);
		System.out.println((index == -1) ? "target is not found using binary search" : "target is found at " + index);
	}

	private static int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target)
				return mid;
			else if (target < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
}
