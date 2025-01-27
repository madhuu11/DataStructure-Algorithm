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
