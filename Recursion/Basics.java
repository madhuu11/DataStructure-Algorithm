package takeUforward.Patterns;

public class Recursion {
	static int n = 10;

	public static void main(String[] args) {
//		Print 1 To N Without Loop
		printNos();
				
//		Print HELLO n times without the loop.
		printHelloNTimes(5);
		
//		Print N To 1 Without Loop
		printNTo1(5);
		
//		Sum of first n terms
		System.out.println(sumOfN(5));

//		Factorials Less than or Equal to n
		nFactorial(n);

//		Reverse a given array
		reverseArray();
	}

	private static void reverseArray() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		// Space-optimized iterative method
//		int[] reverseArr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			reverseArr[--n] = arr[i];
//		}
//		for (int i = 0; i < reverseArr.length; i++) {
//			System.out.print(reverseArr[i] + " ");
//		}

		// Space-optimized iterative method
//		int left = 0, right = n - 1;
//		while (left < right) {
//			int temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//			right--;
//			left++;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// using recursion
		rA_usingRecursion(arr, 0, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void nFactorial(int n) {
		List<Integer> facto = new ArrayList<>();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
			if (n >= f) {
				facto.add(f);
			} else
				break;
		}
		System.out.println(facto);
	}

	private static int sumOfN(int i) {
		if(i>0) {
			sum += i;
			sumOfN(i-1);
		}
		return sum;
//		return i* (i +1)/2;
	}

	private static void printNTo1(int i) {
		if(i>0) {
			System.out.print(i+" ");
			printNTo1(i-1);
		}else {
			return;
		}
	}

	private static void printHelloNTimes(int i) {
		if(i<=0) {
			return;
		}
		System.out.print("HELLO ");
		printHelloNTimes(i-1);
	}

	private static void printNos() {
		if(n>10) {
			return;
		}
		System.out.print(n+" ");
		n++;
		printNos();
		
	}

}
