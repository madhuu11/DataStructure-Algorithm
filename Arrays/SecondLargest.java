public class SecondLargest{
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 3, 18, 11};
		findSecondLargest(arr);
	}

	private static void findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for (int i : arr) {
			if(i > largest) {
				secondLargest = largest;
				largest = i;
			}
			else if(i > secondLargest && i < largest) {
				secondLargest = i;
			}
		}
		System.out.println("Second largest number in an array: " +secondLargest);
	}

}
