public class TernarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 6;
		
		int i = ternarySearch(arr, target, 0, arr.length - 1);
		System.out.println((index == -1) ? "target is not found using ternary search"
				: "target is found at " + index + " using ternary search");

	}

	private static int ternarySearch(int[] arr, int target, int left, int right) {
		if (left > right)
			return -1;

		int mid1 = left + (right - left) / 3;
		int mid2 = right - (right - left) / 3;

		if (arr[mid1] == target)
			return mid1;
		if (arr[mid2] == target)
			return mid2;

		if (target < arr[mid1])
			ternarySearch(arr, target, left, mid1 - 1);
		if (target > arr[mid2])
			ternarySearch(arr, target, mid2 + 1, right);
		else
			ternarySearch(arr, target, mid1 + 1, mid2 - 1);

		return -1;
	}
}
