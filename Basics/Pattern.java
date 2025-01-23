package takeUforward.Patterns;

public class Pattern {

	public static void main(String[] args) {
		int n =5;
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
	}

	private static void pattern8(int n) {
		for(int i=n; i>0; i--) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	private static void pattern7(int n) {
		for(int i=0; i<n; i++) {
			for (int j = 0; j < n-i-1; j++ ) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	private static void pattern6(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void pattern4(int n) {
		for(int i=n; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void pattern2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void pattern3(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
