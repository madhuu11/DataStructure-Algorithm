public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 6;
		linearSearch(arr, target);
	}

	private static void linearSearch(int[] arr, int target) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) found = true;
		}
		System.out.println(found ? "target is found using linear search" : "target is not found using linear search");
	}
}
