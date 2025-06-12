import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargest {
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 3, 18, 11};
		findSecondLargest(arr); //optimal approach
		findSecondLargestUsingStream(arr); // its time complexity O(nlogn) as it uses .distinct().sorted()

	}

	private static void findSecondLargestUsingStream(int[] arr) {
		OptionalInt secondLargest = Arrays.stream(arr).distinct().sorted().skip(arr.length-2).findFirst();
		System.out.println("Second largest number in an array: " +secondLargest);
	}

	private static void findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
//		if(arr.length < 2) secondLargest = -1; // validate does array contain second element
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
