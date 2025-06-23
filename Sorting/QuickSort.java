import java.util.Arrays;
import java.util.Iterator;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1 };		
		int[] quickSortArr = quickSort(arr);
		for (int i : quickSortArr) {
			System.out.println(i);
		}
	}

	private static int[] quickSort(int[] arr) {
		if (arr.length <= 1) {
		    return arr;
		}
		int pivot = arr.length-1;
		int[] left = new int[arr.length], right = new int[arr.length];
		int a=0, b=0;
		for (int i = 0; i < pivot; i++) {
			if(arr[i]<arr[pivot]) {
				left[a++]=arr[i];
			}else right[b++]=arr[i];
		}
		//caused infinte loop so trimmed trailing zeroes
		int[] trimmedLeft = Arrays.copyOf(left, a);
		int[] trimmedRight = Arrays.copyOf(right, b);
		return mergeQuick(quickSort(trimmedLeft), arr[pivot], quickSort(trimmedRight));
	}

	private static int[] mergeQuick(int[] left, int pivot, int[] right) {
		int[] combine = new int[left.length+right.length+1];
		int k=0;
		for (int i = 0; i < left.length; i++) {
			combine[k++] = left[i];
		}
		combine[k++] = pivot;
		for (int i = 0; i < right.length; i++) {
			combine[k++] = right[i];
		}
		return combine;
	}
}
