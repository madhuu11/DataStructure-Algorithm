public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i], j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
