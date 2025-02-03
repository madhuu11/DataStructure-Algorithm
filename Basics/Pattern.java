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
		pattern9(n); //diamond problem
		pattern10(n);
		pattern11(n); //Binary Number Triangle Pattern
		pattern12(n); //Number crown pattern
		pattern13(n); //increasing number
		pattern14(n); //increasing letter
		pattern15(n); //decreasing letter
		pattern16(n); //Alpha ramp pattern
	}

	private static void pattern16(int n) {
		char ch ='A';
		for(int i=0; i<n; i++, ch++) {
			for(int j=0; j<=i; j++) {
				System.out.print(ch);
			}
//			ch++;
			System.out.println();
		}
	}

	private static void pattern15(int n) {
		for(int i=0; i<n; i++) {
			char ch ='A';
			for(int j=n; j>i; j--) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	private static void pattern14(int n) {
		for(int i=0; i<n; i++) {
			char ch = 'A';
			for(int j=0; j<=i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	private static void pattern13(int n) {
		int a = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(a++ +" " );
			}
			System.out.println();
		}
	}

	private static void pattern12(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(int j=0; j<2*(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern11(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}else
				System.out.print(0);
			}
			System.out.println(" ");
		}
	}

	private static void pattern10(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=n; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	private static void pattern9(int n) {
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
