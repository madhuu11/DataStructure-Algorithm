import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1 };
		int[] mergeSortArr = mergeSort(arr);
		for (int i : mergeSortArr) {
			System.out.println(i);
		}
	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length != 1) {
			int mid = arr.length / 2;
			int[] left = Arrays.copyOfRange(arr, 0, mid);
			int[] right = Arrays.copyOfRange(arr, mid, arr.length);
			left = mergeSort(left);
			right = mergeSort(right);

			return merge(left, right);
		}
		return arr;
	}

	private static int[] merge(int[] left, int[] right) {
		int[] mergeArr = new int[left.length + right.length];
		int a = 0, j = 0, i = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				mergeArr[a++] = left[i++];
			} else {
				mergeArr[a++] = right[j++];
			}
		}
		while (i < left.length) {
			mergeArr[a++] = left[i++];
		}
		while (j < right.length) {
			mergeArr[a++] = right[j++];
		}
		return mergeArr;
	}
}
