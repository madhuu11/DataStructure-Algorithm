package takeUforward.Patterns;

public class Recursion {
	static int n = 10;

	public static void main(String[] args) {
//		Print 1 To N Without Loop
		printNos();
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
