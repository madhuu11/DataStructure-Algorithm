package takeUforward.Patterns;

import java.util.Arrays;

public class ArrayEasyProblems {

	public static void main(String[] args) {
		int[] intArray = {1, 14, 6, 7, 8};

//		Largest Element in Array
		largestElement(intArray);
	}

	private static void largestElement(int[] intArray) {
		//brute force approach
//		Arrays.sort(intArray);
//		System.out.println(intArray[intArray.length-1]);
		
		//recursive approach
		int max = intArray[0];
		for (int i: intArray) {
			if(i>max) {
				max =i;
			}
		}
		System.out.println(max);
	}

}
