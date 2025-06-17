public class SelectionSort {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 6 };
    selectionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

}
