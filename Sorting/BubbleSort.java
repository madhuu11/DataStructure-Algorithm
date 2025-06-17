public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 6 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
  }
